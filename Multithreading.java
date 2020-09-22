package LabWeek10;
import java.util.*;

class HasMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        //Adding elements to Hashmap
        hashMap.put(1979,"Eric");
        hashMap.put(2005,"John");
        hashMap.put(2012,"Dona");
        hashMap.put(1980,"Josh");
        //Display content using iterator
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
        // Get values based on keys
        String var = hashMap.get(3);
        System.out.println(var);
    }

}




