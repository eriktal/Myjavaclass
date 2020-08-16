import java.util.Scanner;

public class JavaLab3 {
    //Calculating hydrostatic pressure
    public static void hydraulic_Pressure_Calculator() {
        int pressure;
        int depth ;
        int density;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depth in ft ");
        depth = sc.nextInt();
        System.out.println("Enter the density of the fluid ");
        density = sc.nextInt();
        if (depth > 0) {
            if (density > 0) {
                pressure = (int) (0.052 * density * depth);
                System.out.println("The Hydraulic Pressure in psi is " + pressure);
            }
        } else {
            System.out.println("You must enter a positive number");
        }

    }
// comparing numbers
    public void student_age_comparison(){
        int student1,student2,student3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first student age");
        student1 = sc.nextInt();
        System.out.println(" Enter second student age");
        student2 = sc.nextInt();
        System.out.println(" Enter third student age");
        student3 = sc.nextInt();
        if(student1 > student2 && student2>student3){
            System.out.println("Student 1 is the oldest in the class");}
        else if (student2>student1 && student1>student3){
                System.out.println( "Student 2 the oldest in the class");}
        else if (student3>student2 && student2>student1){
            System.out.println("Student 3 is the oldest");
                }

        }

    public static void main(String[] args) {
        hydraulic_Pressure_Calculator();
        JavaLab3 ojb = new JavaLab3();
        ojb.student_age_comparison();
    }
}





