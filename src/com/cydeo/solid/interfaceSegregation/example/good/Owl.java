package com.cydeo.solid.interfaceSegregation.example.good;

public class Owl implements CanEat,CanWalk,CanFly{

    @Override
    public void eat() {
        System.out.println("Owl is eating");
    }

    @Override
    public void fly() {
        System.out.println("Owl is flying");
    }

    @Override
    public void walk() {
        System.out.println("Owl is walking");
    }
}
