package parameters;

import java.util.Scanner;

public class StringsParameters {

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
            ch = s.charAt(vowelCount++);
            vowelCount++;
        }
        System.out.println("Het aantal klinkers is: " + vowelCount);

//test op webpage
        if (s.startsWith("http://")) {
            System.out.println("Er werd een url ingegeven");
        }
    }
}
