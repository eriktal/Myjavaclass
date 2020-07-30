import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        char vowel;
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        vowel = sc.next().charAt(0);
        switch (vowel) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            case 'y':
            case 'Y': isVowel = true;}
                if (isVowel) {
                    System.out.println(vowel + " is a vowel");}
                else if ((vowel >= 'a' && vowel <= 'z') || (vowel >= 'A' && vowel <= 'Z'))
                        System.out.println(vowel + " is a consonant");
                    else
                        System.out.println("Invalid input");

                }


        }









