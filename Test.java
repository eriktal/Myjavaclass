package CodeWithMe;

 class LabBicycle {
    int gear;
    int speed;
    public LabBicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement){
            System.out.println( "Your speed is: "+decrement);
        }

    public void speedUp(int increment){
        if (increment<70){
            System.out.println("Your speed is: "+increment);
        }
        else {
            System.out.println("Your speed is: "+increment+". Consider slowing down.");
        }
    }
}
class MountainBike extends LabBicycle{
    int seatHeight;
    public MountainBike(int gear, int speed,int seatHeight) {
        super(gear, speed);
        this.seatHeight=seatHeight;
    }
    public void setHeight(int newValue){
        this.seatHeight= newValue;
        System.out.println("Your new seat height is: "+newValue);
}
        }
        class Owner {
        int age;
        String name;
        MountainBike bike;
       public Owner(String name, int age, MountainBike bike){
           this.name=name;
           this.age=age;
           this.bike=bike;
       }
       public void setNameAge(String name,int age){
           this.name = name;
           this.age= age;
           System.out.print("Hi there "+name);
           System.out.println("! You are "+age);
       }
        }
      public   class Test extends MountainBike{
            public Test(int gear, int speed, int seatHeight) {
                super(gear, speed, seatHeight);
            }

            public static void main(String[] args) {
                Test test =new Test(4,70,5);
                Owner own = new Owner("John",30,test);
                own.setNameAge("Eric",30);
                own.bike.speedUp(80);
                own.bike.setHeight(10);
                own.bike.applyBrake(65);



            }

        }
