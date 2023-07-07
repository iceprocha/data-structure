package br.com.iteris.model;

public class Vehicle {
  private int power;

  private String name;

  public Vehicle(int power, String name) {
    this.power = power;
    this.name = name;
  }
  public int getPower() {
    return power;
  }
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nPower: " + this.power + "\n";
  }
}
