package br.com.iteris.struct;

import br.com.iteris.model.SuperVehicle;
import br.com.iteris.model.Vehicle;

import java.util.Arrays;

/*
  Estrutura de dados -> linear -> estatica
  https://www.geeksforgeeks.org/array-data-structure/

  Uma matriz é uma coleção de itens armazenados em locais de memória contíguos.
  A ideia é armazenar vários itens do mesmo tipo juntos.

  https://www.geeksforgeeks.org/where-is-the-memory-allocated-for-arrays-in-java/
  https://stackoverflow.com/questions/2099695/is-a-java-array-of-primitives-stored-in-stack-or-heap
*/
public class StructStatic {
  public void arrInt() {
    int[] array = {2, 4, 10, 5, 15, 3};
    for (int i = 0; i < array.length; i++) {
      System.out.println("Indice: " + i + " Elemento: " + array[i]);
    }
  }

  public void arrClass() {

    Vehicle[] array =
        {new Vehicle(1, "uno"),
         new Vehicle(2, "gol"),
         new Vehicle(3, "parati"),
         new SuperVehicle(10, "Carro do Batman")};

        Vehicle[] arrayClone = Arrays.copyOf(array, 5);
        arrayClone[4] = new Vehicle(1, "punto");
        array = arrayClone;

    for (Vehicle carro : array) {
      System.out.println(carro);
    }
  }

  public void arrStringBidimensional() {
    String[][] arrayBidimensional =
        {{"A", "B", "C"},
         {"D", "E", "F"},
         {"G", "H", "I"}};

    for (int i = 0; i < arrayBidimensional.length; i++) {
      for (int j = 0; j < arrayBidimensional[i].length; j++) {
        System.out.println("[" + i + "][" + j + "] = " + arrayBidimensional[i][j]);
      }
    }
  }
}
