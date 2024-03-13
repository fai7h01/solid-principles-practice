package com.cydeo.solid.interfaceSegregation.example.good;

public class Chicken implements CanEat,CanWalk{

    @Override
    public void eat() {
        System.out.println("Chicken is eating");
    }

    @Override
    public void walk() {
        System.out.println("Chicken is walking");
    }
}
