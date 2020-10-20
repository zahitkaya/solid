package solid;

import org.springframework.cglib.transform.impl.AddDelegateTransformer;

public class SingleResponsibility {
    //Bu prensibe göre bir sınıfın veya bir metodun tek bir görevi olmalıdır.
    //Bu prensibe uyarak yazdığımız kodları daha anlaşılır hale getiririz.
    // Proje ekibine yeni katılan biri dahi sınıf isimlerinden ve metot isimlerinden nerelerde hangi işlemlerin yapıldığını kolayca anlar.
    //Örnek olarak

}


class User{
    private int id;
    private String name;
    private Adress adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

}
//Addresi farklı bir sınıfta yazarak, adresle ilgili herhangi bir yeni bilgi istendiğinde User classımızı etkilemeyecektir.
class Adress{
    private String city;
    private String street;

    public Adress(){

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