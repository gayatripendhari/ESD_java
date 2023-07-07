import java.util.*;
class CampareTwoNum1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Given two numbers are equal");
        }else if(num1>num2){
            System.out.println("Num1 is greater than num2");
        }
        else{
            System.out.println("num1 is lesser than num2");
        }
    }
}