package com.example;

class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);

        plane.onboard("Karthik");
        plane.onboard("Rahul");
        plane.onboard("Ananya");

        System.out.println("Take-off time: " + plane.takeOff());
        System.out.println("Passengers: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}