import java.util.ArrayList;
import java.util.Iterator;

class ElementArrayList extends ArrayList<Element> implements Element {
    private static final long serialVersionUID = 1222179582713735628L;

    public void accept(Visitor v) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element e = it.next();
            e.accept(v);
        }
    }
}
