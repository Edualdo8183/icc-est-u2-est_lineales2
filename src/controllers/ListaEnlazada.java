package controllers;

import models.Node;

public class ListaEnlazada<T> {

    public Node <T> head;
    private int size = 0;

    public void append(T data) {
        Node <T> newNode = new Node <T>(data);
        if(head == null) {
            head = newNode;
            size++;
            return;

        }
        //Tender que llegar al ultimo
        // y a eso agregar el nodo 
        Node <T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
    }

    public void getData() {
    Node<T> current = head;
    while (current != null) {
        System.out.println(current.getData());
        current = current.getNext();
    }
}

public void deleteFirst() {
    if (head != null) {
        head = head.getNext();
        size--;
    }
}

public void deleteLast() {
    if (head == null) return;

    // Si solo hay un nodo
    if (head.getNext() == null) {
        head = null;
        size--;
        return;
    }

    // Ir hasta el penúltimo nodo
    Node<T> current = head;
    while (current.getNext().getNext() != null) {
        current = current.getNext();
    }

    current.setNext(null);
    size--;
}

public void deleteNode(T data) {
    if (head == null) return;

    // Si el nodo a borrar es el primero
    if (head.getData().equals(data)) {
        head = head.getNext();
        size--;
        return;
    }

    // Buscar el nodo anterior al que queremos borrar
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
}
