package com.company;

import java.util.*;

public class UseInsurance {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int insurance;

        System.out.println(" *Enter 1 for Life Insurance*  \n *Enter 2 for Health Insurance*");
        String userInput =input.next();
        insurance =Integer.parseInt(userInput);

        if (insurance == 1)
            insuranceLife();
        else if (insurance == 2)
            insuranceHealth();

        else
        System.out.println(" Error Number entered ");

    }

    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }

    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }
}
