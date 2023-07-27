import java.util.*;
class Greeting{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //s1.nextLine();
        String name = s1.nextLine();
        System.out.println("Hello "+ name+"!...Welcome to our java community." );

    }
}