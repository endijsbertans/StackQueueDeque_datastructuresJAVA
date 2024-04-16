package datastr.nodes;

public class MyNodeS<Ttype> {
    private Ttype element;
    private MyNodeS<Ttype> next;
    public MyNodeS(Ttype element) {
        this.element = element;
    }
    public Ttype getElement() {
        return element;
    }
    public void setElement(Ttype element) {
        this.element = element;
    }
    public MyNodeS<Ttype> getNext() {
        return next;
    }
    public void setNext(MyNodeS<Ttype> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return element.toString();
    }
}