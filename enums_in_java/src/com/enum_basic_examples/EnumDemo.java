package com.enum_basic_examples;

import java.util.Scanner;

public class EnumDemo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        monthDays();
    }

    static void monthDays() {

        while (true) {

            System.out.println("Enter month name (or type exit to stop): ");
            String monthName = scanner.nextLine().trim().toLowerCase();

            if (monthName.equals("exit")) {
                break;
            }

            switch (monthName) {

                case "jan":
                    System.out.println("jan contains : " + CalendarMonths.JAN.getDays() + " days");
                    break;

                case "feb":
                    System.out.println("feb contains : " + CalendarMonths.FEB.getDays() + " days");
                    break;

                case "mar":
                    System.out.println("mar contains : " + CalendarMonths.MAR.getDays() + " days");
                    break;

                case "apr":
                    System.out.println("apr contains : " + CalendarMonths.APR.getDays() + " days");
                    break;

                case "may":
                    System.out.println("may contains : " + CalendarMonths.MAY.getDays() + " days");
                    break;

                case "jun":
                    System.out.println("jun contains : " + CalendarMonths.JUN.getDays() + " days");
                    break;

                case "jul":
                    System.out.println("jul contains : " + CalendarMonths.JUL.getDays() + " days");
                    break;

                case "aug":
                    System.out.println("aug contains : " + CalendarMonths.AUG.getDays() + " days");
                    break;

                case "sep":
                    System.out.println("sep contains : " + CalendarMonths.SEP.getDays() + " days");
                    break;

                case "oct":
                    System.out.println("oct contains : " + CalendarMonths.OCT.getDays() + " days");
                    break;

                case "nov":
                    System.out.println("nov contains : " + CalendarMonths.NOV.getDays() + " days");
                    break;

                case "dec":
                    System.out.println("dec contains : " + CalendarMonths.DEC.getDays() + " days");
                    break;

                default:
                    System.out.println("Invalid month");
            }
        }
    }
}
