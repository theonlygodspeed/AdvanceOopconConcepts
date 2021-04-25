package com.company;

public abstract class Book {

    private String title;
    protected double price;


    public Book(String title) {
        super();
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }


    public abstract void setPrice();


}