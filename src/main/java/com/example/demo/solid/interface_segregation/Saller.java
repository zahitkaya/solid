package com.example.demo.solid.interface_segregation;

public class Saller implements IPerson {
    //Saller(Esnaf) Olmak için üniversite eğitime görmeye gerek yok. O yüzden educationu implement etmedik.
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public String getCounty() {
        return null;
    }
}
