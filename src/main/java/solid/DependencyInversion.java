package solid;

public class DependencyInversion {
    /*
    Varlıklar(Alt sınıflar ve Üst sınıflar) somut olmayan soyutlamalara bağlı olmalıdır. Üst seviye modülün düşük seviye
    modülüne bağlı olmamasını, ancak soyutlamalara bağlı olması gerektiğini belirtir. Alt sınıflarda yapılan
     değişiklikler üst sınıfları etkilememelidir.
     */
    public static void main(String[] args) {
        IController door = new Door();
        IControll doorControl = new ControllManegement(door);
        doorControl.apply();//Door closed
        doorControl.apply();//Door opened

        IController window = new Window();
        IControll windowControll = new ControllManegement(window);
        windowControll.apply();//Window opened
        windowControll.apply();//Window closed


    }
}

interface IControll {
    boolean isPressed();

    void apply();
}

interface IController {
    void open();

    void close();
}
//IControll arayüzünü kumanda gibi düşünelim. Her bastığımızda bir şeyleri açıp kapatacak.

class ControllManegement implements IControll {
    private boolean button;
    IController client;

    @Override
    public boolean isPressed() {
        return button;
    }

    ControllManegement(IController client) {
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

class Door implements IController {

    @Override
    public void open() {
        System.out.println("Door opened");
    }

    @Override
    public void close() {
        System.out.println("Door closed");
    }
}

//Bağımlılığımız olmadığından hiç bir kodu değiştirmeden yeni bir nesne ekleyebiliriz.
class Window implements IController {

    @Override
    public void open() {
        System.out.println("Window opened");
    }

    @Override
    public void close() {
        System.out.println("Window closed");
    }
}



