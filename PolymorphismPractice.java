package Com.learning;

public class PolymorphismPractice {
    public void test(){
        System.out.println("This is a a poly practice");
    }
}
class Animals{

    public void sound(){
        System.out.println("Animal is making a sound");
    }
}
class Lion extends Animals{
    @Override
    public void sound(){
        System.out.println("A lion is roaring");
    }
}
class Horse extends Animals{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }

    public static void main(String[] args) {
        Animals obj = new Horse();
        obj.sound();
        
    }
}