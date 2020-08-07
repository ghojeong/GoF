import java.util.Iterator;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public abstract void visit(String currentDir);

    public Entry add(Entry entry) {
        return null;
    }

    public Iterator<Entry> iterator() {
        return null;
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
