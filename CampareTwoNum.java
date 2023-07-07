//Campare two numbers a and b using only if-else loop
import java.util.*;
class CampareTwoNum{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Given Two Numbers are equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("a is lesser than b");
            }
        }
    }
}