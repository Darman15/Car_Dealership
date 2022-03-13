package com.claim.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_Number")
    private int transactionNum;

    @Column(name = "dateListed")
    private Date dateListed;

    @Column(name = "sellDate")
    private Date dateSold;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchasing_user")
    private User purchasingUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_purchased")
    private Vehicle vehicle;

    @Column(name = "sell_Price")
    private double sellPrice;

    public Purchase(int transactionNum, Date dateListed, Date dateSold, User purchasingUser, Vehicle vehicle, double sellPrice) {
        this.transactionNum = transactionNum;
        this.dateListed = dateListed;
        this.dateSold = dateSold;
        this.purchasingUser = purchasingUser;
        this.vehicle = vehicle;
        this.sellPrice = sellPrice;
    }

    public Purchase() {

    }

    public int getTransactionNum() {
        return transactionNum;
    }

    public void setTransactionNum(int transactionNum) {
        this.transactionNum = transactionNum;
    }

    public Date getDateListed() {
        return dateListed;
    }

    public void setDateListed(Date dateListed) {
        this.dateListed = dateListed;
    }

    public Date getDateSold() {
        return dateSold;
    }

    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }

    public User getPurchasingUser() {
        return purchasingUser;
    }

    public void setPurchasingUser(User purchasingUser) {
        this.purchasingUser = purchasingUser;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
