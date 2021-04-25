package com.company;

public class UseBook {

    public static void main(String[] args) {


        Fiction f=new Fiction("The Great Gatsby");


        System.out.println(f.toString());


        NonFiction nf=new NonFiction("A Promise Land Barack Obama");


        System.out.println(nf.toString());
    }

}
