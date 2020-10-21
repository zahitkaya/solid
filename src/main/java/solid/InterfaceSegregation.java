package solid;

public class InterfaceSegregation {
    /*
    Bir arayüze gerekli olmayan eklentilerin eklenmemesini belirten bir prensiptir.
    Arayüzde o an sadece kullanılacak olan eklentilerin ekli olması gerektiğini savunur.

     */
}
/*
interface IUser{
    String getName();
    int getId();
    String getAdress();
    String getCounty();
    String getSchool();
    Boolean getGraduation();
}
 */
/*Yukardaki interface kod olarak çalışabilir. Ama bir kullanıcının kimlik,adres ve
 eğitim bilgisinin aynı arayüzde olması ne kadar doğru?
 */

interface IUser{
    String getName();
    int getId();
}
interface IAdress{
    String getAdress();
    String getCounty();
}
interface IEducation{
    String getSchool();
    Boolean getGraduation();
}
//Böylelikle bütün arayüzlere gereğinden fazla yüklememiş olduk.

