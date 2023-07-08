import java.util.*;
class PrintnEven{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("All even numbers till "+ n + " is:" );
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}