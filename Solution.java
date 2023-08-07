import java.util.*;

public class Solution {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int[] rev_arr = new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        for(i=0;i<n;i++){
            rev_arr[i] = arr[n-1-i];
        }
        for(i=0;i<n;i++){
            System.out.print(rev_arr[i]+" ");
        }    
    }
}

