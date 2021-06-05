/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex17.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight? ");
        double weight = input.nextInt();

        System.out.print("Gender? (1) for male, (2) for female ");
        int gender = input.nextInt();

        System.out.print("Total Alcohol Consumed (in ounces)? ");
        double alcConsumed = input.nextDouble();

        System.out.print("Hours since last drink? ");
        double hours = input.nextDouble();

        BAC calculate = new BAC(weight, gender, alcConsumed, hours);
        double bac = calculate.calculateBAC();

        System.out.printf("Your BAC is %.2f", bac);

        if( bac > 0.08){
            System.out.println("\nIt is not legal for you to drive");
        }else{
            System.out.println("\nIt is legal for you to drive");
        }

    }
}
