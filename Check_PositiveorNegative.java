import java.util.Scanner;

public class Check_PositiveorNegative
{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Given number is positive Number....");
        }
        else if (n<0) {
            System.out.println("Given number is negative number.......");
            
        } else {
            System.out.println("Given number is zero...");
            
        }
        
    }
}