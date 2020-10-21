package com.example.demo.solid.dependency_inversion;

public class ControllManegement implements IControll {
    private boolean button;
    IController client;

    public boolean isPressed() {
        return button;
    }

    public ControllManegement(IController client) {
        this.client = client;
        button = false;
    }

    @Override
    public void apply() {
        if (isPressed()) {
            client.open();
            this.button = false;
        } else {
            client.close();
            this.button = true;
        }
    }

}
