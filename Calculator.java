import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        System.out.print("Enter your Choice: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                double sum = a + b;
                System.out.println("Addition is:" + sum);
                break;
            case 2:
                double sub= a - b;
                System.out.println("Subtraction is:" + sub);
                break;
            
            case 3:
                double mul = a * b;
                System.out.println("Multiplication is:" + mul);
                break;
            
            case 4:
                double div = a / b;
                System.out.println("Division is:" + div);
                break;
            
            case 5:
                double rem = a % b;
                System.out.println("Remainder is:" + rem);
                break;
        
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}