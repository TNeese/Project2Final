package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "vehicles")
public class Vehicle implements Serializable {

    public Vehicle(){
    }

    @Id
    private int id;
    private String makeModel;
    private int year;
    private double retailPrice;

    Vehicle(int id, String makeModel, int year, double retailPrice){
        this.id = id;
        this.makeModel = makeModel;
        this.year = year;
        this.retailPrice = retailPrice;
    }

    private Vehicle content;

    public String toString() {
        return this.getId() + ", " + this.makeModel + ", Year: " + this.year + ", Price: " + this.retailPrice;
    }

    private int getId() {
        return id;
    }

    private String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    private int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setContent(Vehicle newVehicle){
        makeModel = newVehicle.getMakeModel();
        year = newVehicle.getYear();
        retailPrice = newVehicle.getRetailPrice();
    }

    public Vehicle getContent() {
        return content;
    }
}
