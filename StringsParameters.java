package be.vdab.parameters;

import java.util.Scanner;

public class StringsParameters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Geef woord(en) in: ");
        String s = input.nextLine();

        int low = 0;
        int high = s.length()-1;
        char ch = s.charAt(0);
        int count = 0;
        String url = "";

//test palindroom
        boolean isPalindrome = true;
        while (low < high) {

//tel aantal klinkers & print
            if (Character.isLetter(ch)) {
                switch(Character.toUpperCase(ch))
                {
                    case 'A':
                    case 'E':
                    case 'I':
                    case '0':
                    case 'U':
                        System.out.println(ch + " is een klinker");
                        count = count +1;
                        break;
                    default:
                }
            }
            System.out.println("Het aantal klinkers is: " + count);

            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
//?teller hier laten staan?
            low = low+1;
            high = high+1;
        }
if (isPalindrome) {
    System.out.println(s + " is een palindroom");
} else
        System.out.println(s + " is geen palindroom");
    }
}