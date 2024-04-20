package datastr.nodes;

public class MyNodeQ<Ttype> {
    private Ttype element;
    private MyNodeQ<Ttype> next;
    private MyNodeQ<Ttype> previous;
    public MyNodeQ(Ttype element) {
        this.element = element;
    }
    public Ttype getElement() {
        return element;
    }
    public void setElement(Ttype element) {
        this.element = element;
    }
    public MyNodeQ<Ttype> getNext() {
        return next;
    }
    public void setNext(MyNodeQ<Ttype> next) {
        this.next = next;
    }
    public MyNodeQ<Ttype> getPrevious() {
        return previous;
    }

    public void setPrevious(MyNodeQ<Ttype> previous) {
        this.previous = previous;
    }
    @Override
    public String toString() {
        return element.toString();
    }
}