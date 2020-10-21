package com.example.demo.solid.dependency_inversion;

//Bağımlılığımız olmadığından hiç bir kodu değiştirmeden yeni bir nesne ekleyebiliriz.
public class Window implements IController {

    @Override
    public void open() {
        System.out.println("Window opened");
    }

    @Override
    public void close() {
        System.out.println("Window closed");
    }
}
