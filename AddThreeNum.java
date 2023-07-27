import java.util.*;
class AddThreeNum{
    public static void main(String[] args) {
        int a ,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number which you want to add: ");
        a = sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum = a + b + c;
        System.out.println("Addition is: "+sum);



    }
}