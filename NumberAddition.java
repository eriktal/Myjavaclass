import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Your Second Number");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 +num2;
        System.out.println("Your Total is "+ sum);

    }
}
