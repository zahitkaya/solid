package solid;

import org.junit.Test;

public class LiskovSubstitution {
    /*
    Alt seviye sınıflardan oluşan nesnelerin/sınıfların, ana(üst) sınıfın nesneleri ile yer değiştirdikleri zaman,
    aynı davranışı sergilemesi gerekmektedir. Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir
     */

    public static void main(String[] args) {
        Square s = new Square();
        s.setHeight(5);
        Area area = new Area();
        System.out.println(area.calculateArea(s));//25

        Rectangle r=new Rectangle();
        r.setHeight(10);
        r.setWeight(2);
        System.out.println(area.calculateArea(r));//20
    }
}
//Kare bir dikdörtgendir. Ama her diktörtgen kare değildir.

class Rectangle {
    private int height;
    private int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Square extends Rectangle {
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

class Area {
    int calculateArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWeight();
    }
}




