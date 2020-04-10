public class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteAggregate<T> aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < aggregate.size()) {
            return true;
        }
        return false;
    }

    public T next() {
        return aggregate.get(index++);
    }
}
