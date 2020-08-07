import java.util.Iterator;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public abstract void visit(String currentDir);

    public void add(Entry entry) {
    }

    public Iterator<Entry> iterator() {
        return null;
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
