package org.example;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#0.#");
        Scanner scanner = new Scanner(System.in);
        float height, weight, bMI;

        System.out.println("Enter your weight in pounds: ");

        while (true) {
            try {
                weight = scanner.nextFloat();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. Must be a number: ");
                scanner.next();
            }
        }

        System.out.println("Now enter your height in inches (there are 12 inches in 1 foot): ");
        while (true) {
            try {
                height = scanner.nextFloat();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. Must be a number: ");
                scanner.next();
            }
        }

        bMI = (weight / (height * height)) * 703;

        if (bMI > 25)
            System.out.println("Your BMI is " + f.format(bMI) + ".\n" +
                    "You are overweight. Wow. Please see a doctor.");
        else if (bMI < 18.5)
            System.out.println("Your BMI is " + f.format(bMI) + ".\n" +
                    "You are underweight. Please consult your local physician.");
        else
            System.out.println("Your BMI is " + f.format(bMI) + ".\n" +
                    "You are within the ideal weight range.");

        scanner.close();
        }
    }
