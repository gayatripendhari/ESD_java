import java.util.Scanner;

public class Check_EvenorOdd
{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=sc.nextInt();
        if(n>0){
            if(n%2==0){
                System.out.println("Given number is Even Number....");
            }
            else {
                System.out.println("Given number is Odd...");
                
            }
        }
        
        else {
            System.out.println("Entered number is Negative.Please Enter positive numbers to proceed....");
            
        }
        
    }
}