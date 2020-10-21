package com.example.demo.solid.interface_segregation;

public class Teachers implements IPerson,IEducation{
    //Her öğretmen, öğretmen olmak için eğitim görmüştür.
    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public Boolean getGraduation() {
        return null;
    }

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
