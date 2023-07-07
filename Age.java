import java.util.*;
class Age{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int age=s1.nextInt();
        System.out.println("Your age is: "+age+"years. So you're ");
        if(age>18){
            System.out.print("Adult");
        }else{
            System.out.print("Not Adult");
        }
    }
}