package com.example.demo.solid.single_responsibility;

//Addresi farklı bir sınıfta yazarak, adresle ilgili herhangi bir yeni bilgi istendiğinde User classımızı etkilemeyecektir.
public class Adress {
    private String city;
    private String street;

    public Adress() {

    }

    public Adress(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
