package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Insertar
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Sacar
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }

    // Retorna el primero
    public T peek() {
        if (top == null)
            return null;
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
      /*   if (isEmpty()) {
            return 0;
        }

        int count = 0;
        Node<T> aux = top;

        while (aux != null) {
            count++;
            aux = aux.getNext();
        }

        return count;*/
        return size;
    }

    public void printAllNodes() {
        Node<T> current = top;
        System.out.println("Cima ->");

        while (current != null) {
            System.out.println(current.getValue() + " ->");
            current = current.getNext();
        }

        System.out.println("Fin");
    }
}