import java.util.Scanner;

public class Statement {
    public void myClass() {
        int num, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("Enter a second number");
        num2 = sc.nextInt();
        System.out.println("Enter a third number");
        num3 = sc.nextInt();
        if (num >num2 && num > num3)
            System.out.println( num + " is the highest");
        else if (num2 > num && num2>num3)
            System.out.println("The highest number is "+ num2);
         else
            System.out.println("The highest number is "+num3);
        }

    public static void main(String[] args){
        Statement obj = new Statement();
        obj.myClass();

    }
        }








