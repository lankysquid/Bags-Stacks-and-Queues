package edu.ecrchs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input names for a stack, type 'quit' to end");
        String name = in.nextLine();
        while (!name.equalsIgnoreCase("quit")) {
            stack.push(name);
            name = in.nextLine();
        }
        System.out.println("\nYour stack order:");
        for (String s : stack) {
            System.out.println(s);
        }

        Queue<String> queue = new Queue<String>();
        System.out.println("Input names for a queue, type 'quit' to end");
        name = in.nextLine();
        while (!name.equalsIgnoreCase("quit")) {
            queue.enqueue(name);
            name = in.nextLine();
        }
        System.out.println("\n Your Queue order:");
        for(String s : queue) {
            System.out.println(s);
        }
    }
}
