package br.com.iteris;

import br.com.iteris.crazy.CrazyRace;
import br.com.iteris.struct.StructDynamic;
import br.com.iteris.struct.StructStatic;

/*
*   https://www.geeksforgeeks.org/data-structures/?ref=shm
*   https://www.youtube.com/watch?v=Gp2m8ZuXoPg&ab_channel=FabioAkita
* */
public class Main {
  public static void main(String[] args) {
    //1. Estrutura de dados Linear
    //1.1 Estatica
    //Array - Matriz
    //new StructStatic().arrInt();
    //new StructStatic().arrClass();
    //new StructStatic().arrStringBidimensional();

    //1.2 Dinâmica
    //Estrutura de dados Linear Dinâmica
    //Queue - Fila
    //new StructDynamic().ExampleQueue();

    //Stack - Pilha
    //new StructDynamic().ExampleStack();

    //LinkedList - Lista Duplamente Encadeada
    //new StructDynamic().ExampleLinkedList();

    //ArrayList - Lista Matriz
    //new StructDynamic().ExampleArrayList();

    //Performance
    //Vamos Inserir 1.000.000 de registros UUID
    //depois vamos remover 500.000
    //Array x Queue x Stack x LinkedList x ArrayList
    //Rafael: Arraylist
    //Bia: Arraylist
    //Le: Array
    //Joao Array
    //Quem Ganha? apostem???
    new CrazyRace().race();
  }
}






















