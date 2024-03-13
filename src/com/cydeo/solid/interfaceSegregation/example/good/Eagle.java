package com.cydeo.solid.interfaceSegregation.example.good;

public class Eagle implements CanEat,CanFly,CanWalk{

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void walk() {
        System.out.println("Eagle is walking");
    }
}
