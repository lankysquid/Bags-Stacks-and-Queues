package edu.ecrchs;

public class Queue<Item> {
    private Node<Item> last;
    private int num;

    private static class Node<Item> {
        private Item item;
        private Node<Item> last;
    }

    private void push (Item item) {

    }
}