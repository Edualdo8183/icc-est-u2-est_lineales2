package controllers;

import models.Node;

public class ListaEnlazada<T> {

    public Node<T> head;
    private int size = 0;

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
    }

    public void printAllNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) return;

        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;
    }

    public void deleteNode(T data) {
        if (head == null) return;

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(data)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public int size() {
        return size;
    }
}