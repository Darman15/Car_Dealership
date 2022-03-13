package com.claim.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicleID;

    @Column(name = "manufactuter_name")
    private String manufacturerName;

    @Column(name = "kilometers_ran")
    private int kilometersRan;

    @Column(name = "price")
    private double price;

    @Column (name = "model")
    private String model;

    @Column (name = "vehicle_description")
    private String description;

    @Column (name = "year_built")
    private int yearBuilt;

    @Column (name = "days_on_lot")
    private int daysOnLot;

    @Column (name = "new_Or_Used")
    private boolean newOrUsed;


    public Vehicle(int vehicleID, String manufacturerName, int kilometersRan, double price, String model, String description, int yearBuilt, int daysOnLot, boolean newOrUsed) {
        this.vehicleID = vehicleID;
        this.manufacturerName = manufacturerName;
        this.kilometersRan = kilometersRan;
        this.price = price;
        this.model = model;
        this.description = description;
        this.yearBuilt = yearBuilt;
        this.daysOnLot = daysOnLot;
        this.newOrUsed = newOrUsed;
    }

    public Vehicle() {
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getKilometersRan() {
        return kilometersRan;
    }

    public void setKilometersRan(int kilometersRan) {
        this.kilometersRan = kilometersRan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getDaysOnLot() {
        return daysOnLot;
    }

    public void setDaysOnLot(int daysOnLot) {
        this.daysOnLot = daysOnLot;
    }

    public boolean isNewOrUsed() {
        return newOrUsed;
    }

    public void setNewOrUsed(boolean newOrUsed) {
        this.newOrUsed = newOrUsed;
    }
}
