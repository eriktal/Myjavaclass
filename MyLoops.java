
import java.util.Scanner;

public class MyLoops {
        public void myHomework() {
            int num,total=0, count=0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter value to get the sum of it's natural numbers.");
            num = scan.nextInt();

            while( count<=num){
                total = total + count;
                count++;}
            System.out.println("The sum of the "+ num + " first natural numbers is: " + total);
            System.out.println("Now let's print some even numbers ");
            System.out.println("\n");
            }

            //Getting even numbers up to a given value.
        static void myWhileLoop(){
            int num1,num, n = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value to get even numbers: ");
            num1 = sc.nextInt();
            do {
                num = 2*n;
                n++;
                System.out.print(num);
                System.out.print("\t");
            }
            while (num<num1);
            System.out.println("\n");
        }

            //Calculate the factorial of a number using while loop.
            static void myFactorial(){
            long result = 1;
            int number;
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter a number to get a factorial!");
            number = scan.nextInt();

            while (number>0){
                result = result*number;
                number--;}
                System.out.println("The factorial of is "+ result);
            }

    public static void main(String[] args) {
        MyLoops obj= new MyLoops();
        obj.myHomework();
        myWhileLoop();
        myFactorial();
        System.out.println("Have a lovely day!");

    }
    }









