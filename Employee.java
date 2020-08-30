package CodeWithMe;

public class Employee {
    public void A(){
        System.out.println("Employee");
    }
}
class Manager extends Employee{
    public void A(){
        System.out.println("Manager");
    }

    public static void main(String[] args) {
        Manager emp = new Manager();
        emp.A();


    }
}




