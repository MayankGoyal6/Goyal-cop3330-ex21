/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 21
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the number of the month: ");
    int month_number = scanner.nextInt();

    String monthString;
        switch (month_number) {
            case 1:  monthString = "January";       break;
            case 2:  monthString = "February";      break;
            case 3:  monthString = "March";         break;
            case 4:  monthString = "April";         break;
            case 5:  monthString = "May";           break;
            case 6:  monthString = "June";          break;
            case 7:  monthString = "July";          break;
            case 8:  monthString = "August";        break;
            case 9:  monthString = "September";     break;
            case 10: monthString = "October";       break;
            case 11: monthString = "November";      break;
            case 12: monthString = "December";      break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println("The name of the month is " + monthString + ".");
    


  }
}