/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.uts;

/**
 *
 * @author user
 */
public class HydrationCalculator {
     public static int calculateWaterIntake(double timeInHours) {
        // Nathan drinks 0.5 liters of water per hour
        double waterPerHour = 0.5;

        // Calculate the total water intake
        double totalWater = waterPerHour * timeInHours;

        // Round down to the nearest integer (smallest value)
        int roundedLiters = (int) Math.floor(totalWater);

        return roundedLiters;
    }

    public static void main(String[] args) {
        double time1 = 3;   // Example: time = 3
        double time2 = 6.7; // Example: time = 6.7
        double time3 = 11.8;// Example: time = 11.8

        System.out.println("Liters for " + time1 + " hours: " + calculateWaterIntake(time1));
        System.out.println("Liters for " + time2 + " hours: " + calculateWaterIntake(time2));
        System.out.println("Liters for " + time3 + " hours: " + calculateWaterIntake(time3));
    }
}

