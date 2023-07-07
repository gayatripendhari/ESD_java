import java.util.*;
class AreaofCircle{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
         System.out.print("Enter the radius of circle:");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println("Area of circle having radius "+r+" is "+area+"CM sq.");
        
    }
}