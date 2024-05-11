/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.uts;

/**
 *
 * @author user
 */
public class CharacterCounter {
  public static int strCount(String input, char targetChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testString1 = "Hello";
        char target1 = 'o';
        System.out.println("Occurrences of '" + target1 + "' in \"" + testString1 + "\": " + strCount(testString1, target1));

        String testString2 = "Hello";
        char target2 = 'l';
        System.out.println("Occurrences of '" + target2 + "' in \"" + testString2 + "\": " + strCount(testString2, target2));

        String testString3 = "";
        char target3 = 'z';
        System.out.println("Occurrences of '" + target3 + "' in an empty string: " + strCount(testString3, target3));
    }
}  

