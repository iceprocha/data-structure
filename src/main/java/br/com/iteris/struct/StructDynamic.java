package br.com.iteris.struct;

import br.com.iteris.model.Vehicle;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/*
 *  Estrutura de dados -> linear -> Dinâmica
 */
public class StructDynamic {
  /*
   * https://www.geeksforgeeks.org/queue-data-structure/
   * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
   * https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
   */
  public void ExampleQueue() {
    //https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
    //Queue<String> languages = new ArrayDeque<>();
    Queue<String> languages = new ArrayBlockingQueue<>(3);

    languages.add("1-Java");
    languages.add("2-C#");
    languages.add("3-Delphi");
    languages.offer("4-Python");

    System.out.println(languages.poll());
    System.out.println(languages.poll());
    System.out.println(languages.poll());
   // System.out.println(languages.poll());
  }

  /*
   * https://www.geeksforgeeks.org/stack-data-structure/
   * https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
   */
  public void ExampleStack() {
    //Porque não consigo instancia um int em generico em java
    //https://pt.stackoverflow.com/questions/10032/quais-as-diferen%C3%A7as-entre-tipos-gen%C3%A9ricos-em-c-e-em-java
    //https://www.artima.com/articles/generics-in-c-java-and-c#part2

    Stack<String> stack = new Stack<>();
    stack.push("1-Java");
    stack.push("2-C#");
    stack.push("3-Delphi");
    stack.push("4-Python");

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

  /*
   * https://www.w3schools.com/java/java_linkedlist.asp
   * https://www.geeksforgeeks.org/data-structures/linked-list/
   * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
   */
  public void ExampleLinkedList() {

    //recomendado sua utilização quando é necessário muita manipulação dos dados.
    LinkedList<Vehicle> vehicles = new LinkedList<>();

    vehicles.add(new Vehicle(1, "Gol"));
    vehicles.add(new Vehicle(2, "Uno"));
    vehicles.add(new Vehicle(1, "147"));
    vehicles.add(new Vehicle(2, "Parati"));

    vehicles.addFirst(new Vehicle(1, "Kombi"));
    vehicles.addLast( new Vehicle(3, "Camaro"));
    vehicles.add(4, new Vehicle(1, "Celta"));

    vehicles.forEach(System.out::println);
  }

  /*
  * https://www.geeksforgeeks.org/arraylist-in-java/
  * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
  *
  */
  public void ExampleArrayList() {

    ArrayList<Vehicle> vehicles = new ArrayList<>(10);

    vehicles.add(new Vehicle(1, "Gol"));
    vehicles.add(new Vehicle(2, "Uno"));
    vehicles.add(new Vehicle(1, "147"));
    vehicles.add(new Vehicle(2, "Parati"));

    Collection<Vehicle> vehiclesCollection = new LinkedList<>();
    vehiclesCollection.add(new Vehicle(1, "Kombi"));
    vehiclesCollection.add(new Vehicle(3, "Camaro"));
    vehiclesCollection.add(new Vehicle(1, "Celta"));

    vehicles.addAll(vehiclesCollection);

    vehicles.forEach(System.out::println);
  }
}
