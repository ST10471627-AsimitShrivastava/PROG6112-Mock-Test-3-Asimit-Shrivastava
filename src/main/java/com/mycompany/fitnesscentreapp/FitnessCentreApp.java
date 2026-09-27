package com.mycompany.fitnesscentreapp;

import java.util.Scanner;

/**
 * Main class for the FitnessCentreApp Mock test.
 *
 * The main class has deliberately been named FitnessCentreApp so that it matches the
 * Test name exactly, as requested.
 */
public class FitnessCentreApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // GymnEquiptment
        runGymnEquiptment (input);

        System.out.println();

        // Question 2: Smart Courier Vehicle System
        runCourierVehicleReport();

        input.close();
    }

     // Question 1: Records bicycle and motorbike deliveries for three cities,
     // displays the report, calculates totals and identifies the highest city.
    private static void runGymnEquiptment(Scanner input) {

        // Single-Dimensional array containing the three city names.
        String[] cities = {"Cape Town", "Johannesburg", "Durban"};

        /*
         * Two-dimensional array containing bicycle and motorbike deliveries.
         * Column 0 = Bicycle Deliveries
         * Column 1 = Motorbike Deliveries
         *
         * It is initially populated with the sample values from the mock test.
         * The user input below then stores the entered figures in the same array.
         */
        int[][] deliveries = {
            {245, 380},
            {315, 425},
            {290, 350}
        };

        System.out.println("=================================================");
        System.out.println("        QUICKBITE DELIVERY REPORT");
        System.out.println("=================================================");

        // Prompt the user for bicycle and motorbike figures for every city.
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter bicycle deliveries for " + cities[i] + ": ");
            deliveries[i][0] = input.nextInt();

            System.out.print("Enter motorbike deliveries for " + cities[i] + ": ");
            deliveries[i][1] = input.nextInt();

            System.out.println();
        }

        // Display the completed-delivery report.
        System.out.println("-------------------------------------------");
        System.out.printf("%-16s %-12s  %-12s%n",
                "CITY", "BICYCLE", "MOTORBIKE");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s %-12d %-12d%n",
                    cities[i], deliveries[i][0], deliveries[i][1]);
        }

        // Calculate and display each city's total deliveries.
        System.out.println("=================================================");
        System.out.println("TOTAL DELIVERIES FOR EACH CITY");
        System.out.println("==================================================");

        int highestTotal = -1;
        String highestCity = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = deliveries[i][0] + deliveries[i][1];

            System.out.printf("%-16s %d%n",
                    cities[i] + ":", cityTotal);

            // Keep track of the city with the highest total.
            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                highestCity = cities[i];
            }
        }

        // Display the city with the highest total deliveries.
        System.out.println("-------------------------------------------------");
        System.out.println("CITY WITH THE MOST DELIVERIES");
        System.out.println("-------------------------------------------------");
        System.out.println(highestCity);
        System.out.println("=================================================");
    }

    /**
     * Question 2: Creates the required courier report object using the sample
     * data supplied in the mock test and prints the vehicle report.
     */
    private static void runCourierVehicleReport() {

        CourierVehicleReport vehicleReport = new CourierVehicleReport(
                "Electric Scooter",
                "QB-458",
                "Cape Town CBD",
                185
        );

        vehicleReport.printVehicleReport();
    }
}