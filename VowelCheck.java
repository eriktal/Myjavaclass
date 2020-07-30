import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        char vowel;
        boolean isVowel = false;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vowel or not ? Enter a letter to check !!");
        vowel = sc.next().charAt(0);
        switch (vowel) {
            case 'a':
                isVowel = true;
                break;
            case 'A':
                isVowel = true;
                break;
            case 'e':
                isVowel = true;
                break;
            case 'E':
                isVowel = true;
                break;
            case 'i':
                isVowel=true;
                break;
            case 'I':
                isVowel=true;
                break;
            case 'o':
                isVowel=true;
                break;
            case 'O':
                isVowel=true;
                break;
            case 'u':
                isVowel=true;
                break;
            case 'U':
                isVowel=true;
            case 'y':
                isVowel=true;
                break;
            case 'Y':
                isVowel = true;
                break;
        }
                if (isVowel) {
                    result = true;
                    System.out.println(result);}
                else if ((vowel >= 'a' && vowel <= 'z') || (vowel >= 'A' && vowel <= 'Z')){
                    result = false;
                        System.out.println(result);}

                else
                        System.out.println("Invalid input. Enter a letter please");

                }


        }






