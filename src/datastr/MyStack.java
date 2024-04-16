package datastr;

import datastr.nodes.MyNodeS;

public class MyStack<Ttype> {
    private MyNodeS<Ttype> topNode;
    private int length;

    public MyStack() {
        topNode = null;
        length = 0;
    }

    public boolean isFull() {
        try {
            MyNodeS<Ttype> newNode = new MyNodeS<>(null);
            return false;
        } catch (OutOfMemoryError e) {
            return true;
        }
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public int size() {
        return length;
    }

    public void push(Ttype element) {
        if (!isFull()) {
            MyNodeS<Ttype> newNode = new MyNodeS<>(element);
            newNode.setNext(topNode);
            topNode = newNode;
            length++;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public Ttype pop() {
        if (!isEmpty()) {
            Ttype value = topNode.getElement();
            topNode = topNode.getNext();
            length--;
            return value;
        } else {
            System.out.println("Stack is empty. Can't pop the element.");
            return null;
        }
    }

    public Ttype top() {
        if (!isEmpty()) {
            return topNode.getElement();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            MyNodeS<Ttype> currentNode = topNode;
            while (currentNode != null) {
                System.out.println(currentNode.getElement());
                currentNode = currentNode.getNext();
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void clear() {
        topNode = null;
        length = 0;
    }
}

