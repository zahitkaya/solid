package com.example.demo.solid.liskov_substitution;

public class Area {
    /*
Alt seviye sınıflardan oluşan nesnelerin/sınıfların, ana(üst) sınıfın nesneleri ile yer değiştirdikleri zaman,
aynı davranışı sergilemesi gerekmektedir. Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir
 */
    public int calculateArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWeight();
    }
}
