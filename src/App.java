import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Xavier Fajardo");
        Node<Person> node1 = new Node<Person>(new Person("Juan",30));

        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 29));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 25));
        node1.setNext(node2); // J -> M
        node2.setNext(node3); // M -> P
        node3.setNext(node4); // P -> D

        System.out.println(node1);

    }
}
