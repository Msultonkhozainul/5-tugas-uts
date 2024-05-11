/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.uts;

/**
 *
 * @author user
 */
public class MultiplesCalculator {
   public static int[] countBy(int x, int n) {
        if (x <= 0 || n <= 0) {
            throw new IllegalArgumentException("Both x and n must be positive integers.");
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = x * (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result1 = countBy(1, 10);
        int[] result2 = countBy(2, 5);

        System.out.print("countBy(1, 10): ");
        printArray(result1);

        System.out.print("countBy(2, 5): ");
        printArray(result2);
    }

    private static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}  

