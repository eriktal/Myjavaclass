
public class Variables {
    int a; // Instance variable declared at the class level and can be used by other method.
    static String diff = ("Difference is: "); // Static Variable starting with Keyword static.

    public void addition(){
        // a,b,c and any_vowel are local variables declared in the addition method. They cannot be used outside this method.
        int b = 100;
        int c = 200;
        char any_vowel = 'A';
        a = b + c; // Instance Variable used to store result.
        System.out.println("Sum of b and c is "+ a);
        System.out.println(any_vowel + " is the first vowel of the alphabet");
    }

    public static void main(String[] args){
        Variables obj =  new Variables();
        int x = 90;
        int y = 60;
        int z = x - y;
        obj.addition();  //Calling method addition to be executed
        System.out.println(diff + z ); // Using my declared static variable

            }

}
