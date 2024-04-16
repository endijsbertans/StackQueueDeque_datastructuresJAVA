package services;

import datastr.MyQueue;
import model.Student;

import java.lang.reflect.Method;
import java.util.Random;

public class MainServiceQueue {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> integerQueue = new MyQueue<>();
        MyQueue<Student> studentQueue = new MyQueue<>();

        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        integerQueue.print();
        System.out.println("Dequeued - " + integerQueue.dequeue());
        integerQueue.print();

        studentQueue.enqueue(new Student("Karlis", "Berzins", new int[]{4,3,6}));
        studentQueue.enqueue(new Student("Anna", "Liepa", new int[]{8,9,10}));
        System.out.println(studentQueue.dequeue());
        studentQueue.print();

        simulateEmergencyCalls();

        executeMethodsInQueue();
    }

    public static void simulateEmergencyCalls() throws Exception {
        MyQueue<String> callQueue = new MyQueue<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(random.nextInt(2000));
            String phoneNumber = "123-456-789" + i;
            callQueue.enqueue(phoneNumber);
            System.out.println("Received call from " + phoneNumber);
        }

        while (!callQueue.isEmpty()) {
            Thread.sleep(random.nextInt(2000));
            String phoneNumber = callQueue.dequeue();
            System.out.println("Serviced call from " + phoneNumber);
        }
    }

    public static void executeMethodsInQueue() throws Exception {
        MyQueue<String> methodQueue = new MyQueue<>();
        methodQueue.enqueue("method1");
        methodQueue.enqueue("method2");
        methodQueue.enqueue("method3");

        while (!methodQueue.isEmpty()) {
            String methodName = methodQueue.dequeue();
            Method method = MainServiceQueue.class.getDeclaredMethod(methodName);
            method.invoke(null);
        }
    }

    public static void method1() {
        System.out.println("Executing method1");
    }

    public static void method2() {
        System.out.println("Executing method2");
    }

    public static void method3() {
        System.out.println("Executing method3");
    }
}