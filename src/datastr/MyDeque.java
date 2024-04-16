package datastr;


import datastr.nodes.MyNodeQ;


public class MyDeque<Ttype> extends MyQueue<Ttype> {
    public void insertFront(Ttype element) {
        if (!isFull()) {
            MyNodeQ<Ttype> newNode = new MyNodeQ<>(element);
            if (isEmpty()) {
                rearNode = newNode;
            } else {
                newNode.setNext(frontNode);
                frontNode.setPrevious(newNode);
            }
            frontNode = newNode;
            length++;
        } else {
            System.out.println("Deque is full. Can't enqueue the element.");
        }
    }

    public void insertRear(Ttype element) {
        enqueue(element);
    }

    public Ttype removeFront() {
        return dequeue();
    }

    public Ttype removeRear() {
        if (!isEmpty()) {
            Ttype value = rearNode.getElement();
            rearNode = rearNode.getPrevious();
            if (rearNode == null) {
                frontNode = null;
            } else {
                rearNode.setNext(null);
            }
            length--;
            return value;
        } else {
            System.out.println("Deque is empty. Can't dequeue the element.");
            return null;
        }
    }

    public void printReverse() {
        if (!isEmpty()) {
            MyNodeQ<Ttype> currentNode = rearNode;
            while (currentNode != null) {
                System.out.println(currentNode.getElement());
                currentNode = currentNode.getPrevious();
            }
        } else {
            System.out.println("Deque is empty.");
        }
    }

    public void clearDeque() {
        clear();
    }
}