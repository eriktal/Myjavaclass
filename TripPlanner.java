package LabWeek10;

import java.util.Scanner;

public class TripPlanner {
    String city = "";
    int days, areaKm2;
    int $expenses,timeDiff;
    double currencyRate;
    String currency;

    public void myIntroduction() {
        System.out.println("Welcome to vacation planner.");
        Scanner inputNName = new Scanner(System.in);
        System.out.print("What is your name ?");
        String name = inputNName.nextLine();
        System.out.print("Nice to meet you " + name + ".");
        System.out.print(" Where are you travelling to ?");
        Scanner cityObj = new Scanner(System.in);
        city = cityObj.nextLine();
        System.out.println("Great ! " + city + " sounds like a great plan.");
    }
    public void myTravelPlan(){

        System.out.print("How many days are you staying in Over there?");
        Scanner objDay = new Scanner(System.in);
        days = objDay.nextInt();
        System.out.print("How much money will you spend on your trip ?" );
        Scanner objExpenses = new Scanner(System.in);
        $expenses = objExpenses.nextInt();
        System.out.print("What is the currency symbol in your destination?");
        Scanner objCurrency = new Scanner(System.in);
        currency = objCurrency.nextLine();
        System.out.print("How many "+currency+ " are in a Dollars");
        Scanner objCurrencyRate = new Scanner(System.in);
        currencyRate = objCurrencyRate.nextDouble();
        System.out.println("Your trip for "+days+ " is the same as "+days*24+" hours or "+ days*24*60+" minutes." );
        System.out.println("Your budget the whole trip is "+ $expenses/days +" $ per day.");
        System.out.println("This makes an average of "+ ($expenses/days)*currencyRate+ currency +" per day in "+city );

    }
    public void timeDiff(){
        areaKm2 = 20000;
        System.out.print("What is the time difference between your home and your destination? " );
        Scanner objTime = new Scanner(System.in);
        timeDiff = objTime.nextInt();
        System.out.print("What is the surface area of your destination in KM^2 ?");
        Scanner objArea = new Scanner(System.in);
        areaKm2 = objArea.nextInt();
        System.out.println("In miles that makes "+ areaKm2 *0.386+ " square miles");
        System.out.println("Save travels !");


    }
    public static void main(String[] args) {
        TripPlanner trip = new TripPlanner();
        trip.myIntroduction();
        trip.myTravelPlan();
        trip.timeDiff();

    }
}
