package services;

import datastr.MyStack;
import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainServiceStack {
    public static void main(String[] args) {
        MyStack<Integer> integerStack = new MyStack<>();
        MyStack<model.Student> studentStack = new MyStack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.print();
        System.out.println("---------------------");
        System.out.println("Popped: " + integerStack.pop());
        integerStack.print();
        integerStack.clear();
        integerStack.print();

        //String name, String surname, int[] grades
        studentStack.push(new Student("Karlis", "Berzins", new int[]{4,3,6}));
        studentStack.push(new Student("Anna", "Liepa", new int[]{8,9,10}));
        System.out.println(studentStack.pop());
        studentStack.print();

    }
}

