import java.util.*;
class AddTwoNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello My Dear Friend "+name);
        System.out.println("Let's give me any two numbers.I will display their addition within few seconds.......");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;
        System.out.print("Sum of Number "+a+" And "+b+" is "+sum);
    }
}