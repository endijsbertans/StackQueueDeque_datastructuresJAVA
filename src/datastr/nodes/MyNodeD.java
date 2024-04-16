package datastr.nodes;

public class MyNodeD<Ttype> {
    private Ttype element;
    private MyNodeD<Ttype> next;
    private MyNodeD<Ttype> previous;

    public MyNodeD(Ttype element) {
        this.element = element;
    }

    public Ttype getElement() {
        return element;
    }

    public void setElement(Ttype element) {
        this.element = element;
    }

    public MyNodeD<Ttype> getNext() {
        return next;
    }

    public void setNext(MyNodeD<Ttype> next) {
        this.next = next;
    }

    public MyNodeD<Ttype> getPrevious() {
        return previous;
    }

    public void setPrevious(MyNodeD<Ttype> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}