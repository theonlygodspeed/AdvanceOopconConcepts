package com.company;

public class Fiction extends Book {


    public Fiction(String title) {
        super(title);
        setPrice();
    }


    @Override
    public void setPrice() {
        price=24.99;

    }


    @Override
    public String toString() {
        System.out.println("<><><> Fiction Book <><><>");
        return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
    }


}