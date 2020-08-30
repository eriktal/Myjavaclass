package Com.learning.Week8;

    public class Animals {
        public Animals(){
        }
        public void animalSounds(){
            System.out.println("The animal makes a sound");
        }
    }
    class Pigs extends Animals{
        public Pigs(){
            super();
        }
        public void animalSounds(){
            System.out.println("Pigs oink");
        }
    }
    class Cats extends Animals{
        public Cats(){
            super();
        }
        public void animalSounds() {
            System.out.println("cats meow");
        }

        public void animalSounds(int num) {
            for (int count = 1; count <= num; ) {
                System.out.println("The cat meowed");
                count++;
            }
            System.out.println("The cat has meowed "+ num +" times");
        }

    }
    class Test{
        public static void main(String[] args) {
            Cats cat = new Cats();
            Pigs pig = new Pigs();
            cat.animalSounds();
            cat.animalSounds(2);
            pig.animalSounds();
        }
    }

