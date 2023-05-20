import java.util.Scanner;

public class FactorialOfNumber{
    public static void main(String[] args){
        int num;
        long factorial = 1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        num=sc.nextInt();
        for(int i=1;i<=num;++i){
            factorial *= i;
        }
        System.out.println("Factorial of a given number is equals to: "+factorial);
    }
}