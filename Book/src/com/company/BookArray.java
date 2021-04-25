package com.company;

public class BookArray {

    public static void main(String[] args) {


        Book bookArray[]={new Fiction("The Great Gatsby"),
                new Fiction("A Game of Thrones"),
                new Fiction("Pride and Prejudice"),
                new Fiction("The Lord of the Rings"),
                new Fiction("Enders Game"),
                new NonFiction("Hidden Figures \nby Margot lee Shetterly"),
                new NonFiction("Devil in the White City \nby Erik Larson"),
                new NonFiction("Hiroshima \nby John Hersey "),
                new NonFiction("Into the Wild \nby Jon Krakauer"),
                new NonFiction("Thinking, Fast and Slow \nby Daniel Kahneman ")};


        for(int i=0;i<bookArray.length;i++)
        {

            System.out.println(bookArray[i].toString());
        }
    }

}