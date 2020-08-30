

import java.util.Scanner;

public class SwitchCase {
    public void mySwitchCase() {
        double num1, num2, output;
        char operators;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        num1 = sc.nextDouble();
        System.out.println("Enter a second number");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/) ");
        operators = sc.next().charAt(0);
        //sc.close();
        switch (operators) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("You have entered a wrong operator");
                return;}

        System.out.println(num1 + "" + operators + "" + num2 + "= " + output);}

    static void myDayInWord(){
            int dayNumber;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a DayNumber");
            dayNumber = sc.nextInt();
            switch (dayNumber) {
                case 0:
                    System.out.println("it's Sunday");
                    break;
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;
                case 3:
                    System.out.println("It's Wednesday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("It's Friday");
                    break;
                case 6:
                    System.out.println("It's Saturday");
                    break;
                default:
                    System.out.println("Not a valid day");

            }

        }

    public static void main(String[] args) {
        myDayInWord();
        System.out.println("Let's use our calculator");
        SwitchCase obj = new SwitchCase();
        obj.mySwitchCase();
        System.out.println("Have a great day!");
    }
    }


