import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2, x,y, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = sc.nextInt();
        System.out.println("Enter a second number");
        num2 = sc.nextInt();
        System.out.println("Enter your last number");
        num3 = sc.nextInt();
        x = (num1 > num2)? num1:num2;
        y = (num3 > num1)? num3:num1;
        System.out.println("The biggest number is " + y);




    }
}