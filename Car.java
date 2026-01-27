package com.example;

public class Car {
    int make;
    String color;
    String transmission;
    public void accelerate() {
        System.out.println("Speed Increases");
    }
    public void brake() {
        System.out.println("Speed decreases");
    }
    public void characteristics() {
        System.out.println("Made" + make);
        System.out.println("color" + color);
        System.out.println("Transmission" + transmission);
    }
}
