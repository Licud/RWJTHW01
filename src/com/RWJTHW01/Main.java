package com.RWJTHW01;

import com.callrecords.CallRecord;
import com.flowerbed.Flowerbed;
import com.person.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        do{

            System.out.println("1. Calculate a circumference.");
            System.out.println("2. Name and address fun.");
            System.out.println("3. 3 countries, 3 Conversations.");
            System.out.println("0. Exit.");

            userInput = scan.nextInt();

            switch (userInput){
                case 1:
                    Flowerbed flowerbed = new Flowerbed();

                    do{
                        System.out.println("Please enter a positive number as a radius");
                        userInput = scan.nextInt();
                    }while(userInput < 0);

                    flowerbed.setCircumference(userInput);
                    System.out.println("The circumference is: " + flowerbed.getCircumference() + "\n");
                break;

                case 2:
                    Person person = new Person();
                    System.out.println("Please enter person name");
                    String strUserInput = scan.next();
                    person.setName(strUserInput);
                    System.out.println("Please enter their address");
                    strUserInput = scan.next();
                    person.setAddress(strUserInput);
                    System.out.print("Hello, ");
                    person.printName();
                    System.out.print("You live, apparently, in ");
                    person.printAddress();
                break;

                case 3:
                    CallRecord[] callRecords = new CallRecord[3];
                    double rateInput;
                    int minutesInput;
                    for(int i = 0; i < callRecords.length; i++){
                        callRecords[i] = new CallRecord();
                        System.out.println("For conversation " + (i + 1) + ", \n Enter the country rate:");
                        rateInput = scan.nextDouble();
                        callRecords[i].setCountryRate(rateInput);
                        System.out.println("Enter length of conversation: ");
                        minutesInput = scan.nextInt();
                        callRecords[i].setCallMinutes(minutesInput);
                    }

                    for(int i = 0; i < callRecords.length; i++){
                        System.out.println("Record " + i+1 + ": " + callRecords[i].getCost());
                    }
                break;
                default:
                    userInput = 0;
                break;
            }

        }while (userInput != 0);
    }
}
