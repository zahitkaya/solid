package com.example.demo.solid.dependency_inversion;

public class Door implements IController {

    @Override
    public void open() {
        System.out.println("Door opened");
    }

    @Override
    public void close() {
        System.out.println("Door closed");
    }
}
