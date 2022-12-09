package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private int ID;
    private String brand;
    private String model;
    private int year;
    public Car(){

    }

    public Car(int ID, String brand, String model, int year) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
