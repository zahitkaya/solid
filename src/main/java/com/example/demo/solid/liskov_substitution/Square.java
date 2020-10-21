package com.example.demo.solid.liskov_substitution;

 public class Square extends Rectangle {
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWeight(height);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
        super.setHeight(weight);
    }

}
