/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.uts;

import javax.annotation.processing.ProcessingEnvironment;

/**
 *
 * @author user
 */
public class createPhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers == null || numbers.length != 10) {
            throw new IllegalArgumentException("Input array must contain exactly 10 integers.");
        }

        // Extract individual digits
        int d1 = numbers[0];
        int d2 = numbers[1];
        int d3 = numbers[2];
        int d4 = numbers[3];
        int d5 = numbers[4];
        int d6 = numbers[5];
        int d7 = numbers[6];
        int d8 = numbers[7];
        int d9 = numbers[8];
        int d10 = numbers[9];

        // Construct the phone number string
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
    }

    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = createPhoneNumber(inputNumbers);
        System.out.println("Phone number: " + phoneNumber);
    }
}

