package com.company;

public class Life extends Insurance {
    public Life() {

        super("Life");
    }

    public void setCost() {

        super.cost = 36;
    }

    public void display() {


        System.out.println(super.getType() + " insurance with monthlyfee of $" + super.getCost());

    }
}