package Com.learning;

public class ToStringMethod {
    int age,grade;
    String name;
    String college;
    public ToStringMethod(String name, int age, String college, int grade){
        this.age = age;
        this.college = college;
        this.grade = grade;
        this.name = name;
    }
    public String toString(){
        return "This is "+ name +". A "+ age +" years old student at "+ college +": Grade "+grade;
    }

    public static void main(String[] args) {
        ToStringMethod tos = new ToStringMethod("Joe",53,"Maria College",98);
        System.out.println(tos.toString());
    }
}
