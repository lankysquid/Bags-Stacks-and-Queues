package edu.ecrchs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input names, type 'quit' to end");
        String name = in.nextLine();
        while (!name.equalsIgnoreCase("quit")) {
            stack.push(name);
            name = in.nextLine();
        }
        System.out.println("\nYour stack order:");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
