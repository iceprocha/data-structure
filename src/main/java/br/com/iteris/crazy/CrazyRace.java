package br.com.iteris.crazy;

import java.util.*;

public class CrazyRace {
  private static int QUANTITY_UUID = 1000000;

  public void race() {
    System.out.println("Start Run!!!");
    System.out.println("==========================");
    raceLinkedList();
    raceArray();
    raceQueue();
    raceStack();
    raceArrayList();
    System.out.println("==========================");
    System.out.println("Finish Run!!!");
  }

  private static void raceArray() {
    long startTime = System.currentTimeMillis();

    UUID[] uuidArray = new UUID[QUANTITY_UUID];
    for (int i = 0; i < QUANTITY_UUID; i++) {
      uuidArray[i] = UUID.randomUUID();
    }

    int quantityRemove = uuidArray.length / 2;
    for (int i = 0; i < quantityRemove; i++) {
      uuidArray[i] = null;
    }

    logTimeEnd(startTime, "ARRAY");
  }

  private static void raceQueue() {
    long startTime = System.currentTimeMillis();

    Queue<UUID> uuidQueue = new ArrayDeque<>();
    for (int i = 0; i < QUANTITY_UUID; i++) {
      uuidQueue.offer(UUID.randomUUID());
    }

    int quantityRemove = uuidQueue.size() / 2;
    for (int i = 0; i < quantityRemove; i++) {
      uuidQueue.poll();
    }

    logTimeEnd(startTime, "QUEUE");
  }

  private static void raceStack() {
    long startTime = System.currentTimeMillis();

    Stack<UUID> uuidStack = new Stack<>();
    for (int i = 0; i < QUANTITY_UUID; i++) {
      uuidStack.push(UUID.randomUUID());
    }

    int quantityRemove = uuidStack.size() / 2;
    for (int i = 0; i < quantityRemove; i++) {
      uuidStack.pop();
    }

    logTimeEnd(startTime, "STACK");
  }

  private static void raceLinkedList() {
    long startTime = System.currentTimeMillis();

    LinkedList<UUID> uuidLinkedList = new LinkedList<>();
    for (int i = 0; i < QUANTITY_UUID; i++) {
      uuidLinkedList.add(UUID.randomUUID());
    }

    int quantityRemove = uuidLinkedList.size() / 2;

    for (int i = 0; i < quantityRemove; i++) {
      uuidLinkedList.removeFirst();
    }

    logTimeEnd(startTime, "LINKED-LIST");
  }

  private static void raceArrayList() {
    long startTime = System.currentTimeMillis();

    ArrayList<UUID> uuidArrayList = new ArrayList<>(QUANTITY_UUID);
    for (int i = 0; i < QUANTITY_UUID; i++) {
      uuidArrayList.add(UUID.randomUUID());
    }

    int quantityRemove = uuidArrayList.size() / 2;
    for (int i = 0; i < quantityRemove; i++) {
      uuidArrayList.remove(0);
    }

    logTimeEnd(startTime, "ARRAY-LIST");
  }

  private static void logTimeEnd(long start, String typeData) {
    long elapsedTime = System.currentTimeMillis() - start;
    System.out.println("Competidor "+typeData+": "+ elapsedTime+" milisegundos");
  }
}
