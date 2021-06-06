/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the month. ");
        int month = input.nextInt();
        System.out.print("The name of the month is ");

        String name;
        switch(month) {
            case 1: name = "January.";
                break;
            case 2: name = "February.";
                break;
            case 3: name = "March.";
                break;
            case 4: name = "April.";
                break;
            case 5: name = "May.";
                break;
            case 6: name = "June.";
                break;
            case 7: name = "July.";
                break;
            case 8: name = "August.";
                break;
            case 9: name = "September.";
                break;
            case 10: name = "October.";
                break;
            case 11: name = "November.";
                break;
            case 12: name = "December.";
                break;
            default: name = "ERROR.";
        }
        System.out.printf("%s", name);

    }
}