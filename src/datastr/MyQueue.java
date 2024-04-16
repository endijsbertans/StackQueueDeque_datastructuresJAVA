package datastr;

import datastr.nodes.MyNodeQ;

public class MyQueue<Ttype> {
    protected MyNodeQ<Ttype> frontNode;
    protected MyNodeQ<Ttype> rearNode;
    protected int length;

    public MyQueue() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isFull() {
        try {
            MyNodeQ<Ttype> newNode = new MyNodeQ<>(null);
            return false;
        } catch (OutOfMemoryError e) {
            return true;
        }
    }

    public boolean isEmpty() {
        return frontNode == null;
    }

    public int size() {
        return length;
    }

    public void enqueue(Ttype element) {
        if (!isFull()) {
            MyNodeQ<Ttype> newNode = new MyNodeQ<>(element);
            if (isEmpty()) {
                frontNode = newNode;
            } else {
                rearNode.setNext(newNode);
            }
            rearNode = newNode;
            length++;
        } else {
            System.out.println("Queue is full. Can't enqueue the element.");
        }
    }

    public Ttype dequeue() {
        if (!isEmpty()) {
            Ttype value = frontNode.getElement();
            frontNode = frontNode.getNext();
            if (frontNode == null) {
                rearNode = null;
            }
            length--;
            return value;
        } else {
            System.out.println("Queue is empty. Can't dequeue the element.");
            return null;
        }
    }


    public void print() {
        if (!isEmpty()) {
            MyNodeQ<Ttype> currentNode = frontNode;
            while (currentNode != null) {
                System.out.print(currentNode.getElement() + ", ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void clear() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }
}