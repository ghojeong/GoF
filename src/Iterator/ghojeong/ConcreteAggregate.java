import java.util.ArrayList;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private ArrayList<T> items;

    public ConcreteAggregate(int n) {
        this.items = new ArrayList<T>(n);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void add(T item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }

    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(this);
    }
}
