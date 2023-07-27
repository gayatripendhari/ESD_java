import java.util.*;
class HollowRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter No. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of cols: ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==row || j==col || j==1 || i==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}