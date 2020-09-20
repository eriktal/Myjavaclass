package LabWeek10;
import java.util.ArrayList;
import java.util.Collections;
public class Lab10 {
    public void myMaxNumber(){
    ArrayList<Integer> test = new ArrayList<>();
        test.add(100);
        test.add(10);
        test.add(45);
        test.add(65);
        test.add(50);
        System.out.println(Collections.max(test) + " is the max number in the array");
}
    public static void main(String[] args) {
        Lab10 test = new Lab10();
        test.myMaxNumber();
    }
}


