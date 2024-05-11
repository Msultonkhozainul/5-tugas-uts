/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.uts;

/**
 *
 * @author user
 */
public class TrafficLightController {
   public static String getNextState(String currentState) {
        switch (currentState.toLowerCase()) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                throw new IllegalArgumentException("Invalid traffic light state: " + currentState);
        }
    }

    public static void main(String[] args) {
        String currentGreen = "green";
        String currentYellow = "yellow";
        String currentRed = "red";

        System.out.println("Next state after green: " + getNextState(currentGreen));
        System.out.println("Next state after yellow: " + getNextState(currentYellow));
        System.out.println("Next state after red: " + getNextState(currentRed));
    }
}   

