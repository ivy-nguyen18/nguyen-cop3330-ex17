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
        boolean flag = false;
        double weight = 0;
        int gender = 0;
        double alcConsumed = 0;
        double hours = 0;

        while(!flag){
            System.out.print("Weight? ");
            if(input.hasNextDouble()){
                weight = input.nextDouble();
                flag = true;
            }
            input.nextLine();
        }

        flag = false;
        while(!flag){
            System.out.print("Gender? (1) for male, (2) for female ");
            if(input.hasNextInt()){
                gender = input.nextInt();
                if(gender == 1 || gender == 2){
                    flag = true;
                }
            }
            input.nextLine();
        }


        flag = false;
        while(!flag){
            System.out.print("Total Alcohol Consumed (in ounces)? ");
            if(input.hasNextDouble()){
                alcConsumed = input.nextDouble();
                flag = true;
            }
            input.nextLine();
        }


        flag = false;
        while(!flag){
            System.out.print("Hours since last drink? ");
            if(input.hasNextDouble()){
                hours = input.nextDouble();
                flag = true;
            }
            input.nextLine();
        }

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
