package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double grams;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter grams:");
        grams = in.nextDouble();
        double kilograms = grams / 1000;
        System.out.println(kilograms + " Kilograms");


    }
}
