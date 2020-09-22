package LabWeek10;
import java.util.*;
public class LinkedListTest{
    public static void main(String[] args) {
        String[] myCity = {"Douala","Bafoussam", "Mbouda"};
        ArrayList<String > cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Lada");
        cars.add("Nissan");
        System.out.println("Printing my Linked List");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Avocado");
        ArrayList<String> cityList = new ArrayList<String >(Arrays.asList(myCity));
        System.out.println("Adding my Array to LinkedList");
        fruits.addAll(cityList);
        fruits.addAll(cars);
        System.out.println("Using for loop");
        for (int i = 0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("Using For-each loop");
        for(String str:fruits){
            System.out.println(str);
        }
        System.out.println("Using iterator");
        Iterator iterator = fruits.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Using While loop");
        int num = 0 ;
        while (fruits.size()>num){
            System.out.println(fruits.get(num));
            num++;
        }
    }
    }

