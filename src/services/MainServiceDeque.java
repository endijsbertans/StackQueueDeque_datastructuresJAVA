package services;

import datastr.MyDeque;
import model.Student;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainServiceDeque {
    public static void main(String[] args) {
        MyDeque<Integer> integerDeque = new MyDeque<>();

        MyDeque<Student> studentDeque = new MyDeque<>();

        integerDeque.insertFront(1);
        integerDeque.insertFront(2);
        integerDeque.insertRear(3);
        integerDeque.print();
        System.out.println("DeDequed - " + integerDeque.removeFront());
        integerDeque.print();
        System.out.println("DeDequed - " + integerDeque.removeRear());
        integerDeque.print();

        studentDeque.insertFront(new Student("Karlis", "Berzins", new int[]{4,3,6}));
        studentDeque.insertFront(new Student("Anna", "Liepa", new int[]{8,9,10}));
        System.out.println(studentDeque.removeFront());
        studentDeque.print();

        simulateBrowserHistory();
    }

    public static void simulateBrowserHistory() {
        MyDeque<String> history = new MyDeque<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;
        while (running) {
            System.out.println("Enter a URL or '1' to print and remove the first URL, '2' to stop ruinning:");
            input = scanner.nextLine();
            if (input.equals("2")) {
                running = false;
            } else if (input.equals("1")) {
                if (!history.isEmpty()) {
                    System.out.println("First URL: " + history.removeFront());
                } else {
                    System.out.println("No URLs in history.");
                }
            } else if ((input != null && input.matches("^(www)\\.[a-zA-Z0-9-_]+\\.[a-zA-Z0-9-_]+"))) {
                if (history.isFull()) {
                    history.removeRear();
                }
                history.insertFront(input);
            } else {
                System.out.println("Invalid input. Please enter a valid URL or '1'.");
            }
            System.out.println("Browser history:" );
            history.print();
        }

    }

    public static boolean isValidURL(String url) {
        if(url != null &&
                url.matches("^(www)\\.[a-zA-Z0-9-_]+\\.[a-zA-Z0-9-_]+"))
            return true;
        else
            return false;

    }
}