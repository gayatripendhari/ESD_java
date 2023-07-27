import java.util.*;
class KMtoMiles{
    public static void main(String[] args) {
        System.out.print("Enter Numbers of KM you have travalled: ");
        Scanner sc = new Scanner(System.in);
        int KM = sc.nextInt();
        float miles = KM * 0.621f;
        System.out.println("you have travelled "+miles+" Miles");
    }
}