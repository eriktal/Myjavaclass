package LabWeek10;

     enum Colors {
         Blue, RED{
             public void myColors(){
                 System.out.println("Dangerous Colors");
             }
             },GREEN;
         public void myColors() {
             System.out.println("This is my best color");
         }
     }
     class Test {
         public static void main(String[] args) {
             Colors[] colors = Colors.values();
             for (Colors c : colors
             ) {
                 System.out.println(c);
                 c.myColors();
             }

         }
     }














