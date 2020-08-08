package be.vdab.parameters;

import java.util.Scanner;

public class StringsParameters {

    /**
     * Er werd gevraagd om implementaties in methodes te zetten in een aparte klasse, niet alles in één main methode.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Geef woord(en) in: ");
        String s = input.nextLine();

//test palindroom
        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low = low + 1;
            high = high + 1;
        }

        if (isPalindrome) {
            System.out.println(s + " is een palindroom");
        } else
            System.out.println(s + " is geen palindroom");

//tel aantal klinkers & print
        int vowelCount = 0;
        char ch = s.charAt(vowelCount);

        while (vowelCount < s.length()) {
            switch (Character.toUpperCase(ch)) {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U':
                    System.out.println(ch + " is een klinker");
                    vowelCount++;
                    break;
                default:
            }
            /**
             * Je gebruikt dezelfde variabele vowelCount om zowel de tel van vowels bij te houden als 'de positie van de cursor' in het woord.
             */
            ch = s.charAt(vowelCount++);
            vowelCount++;
        }
        System.out.println("Het aantal klinkers is: " + vowelCount);

//test op webpage
        /**
         * Applausje voor luiheid! (y)
         */
        if (s.startsWith("http://")) {
            System.out.println("Er werd een url ingegeven");
        }
    }
}
