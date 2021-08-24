package edu.ecrchs;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack<Item> implements Iterable<Item>{
    private Node<Item> first;
    private int num;

    private class Node<Item> {
        private Node<Item> next;
        private Item item;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        num--;
        return item;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        num++;
    }

    /*This is what makes the for-each work with a stack*/

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<Item> {
        Node<Item> current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
