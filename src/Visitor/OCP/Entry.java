import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) {
    }

    public Iterator<Entry> iterator() {
        return null;
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
