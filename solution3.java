/*A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number,n 
, determine and print whether it is prime or not  prime.
 */


import java.io.*;
import java.util.*;

public class Solution3{
    
     static void prime(int n)
    {
        boolean flag=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(n==1){
            System.out.println("Not prime");
        }
        else if(!flag){
            System.out.println("Prime");
        }
        
        else{
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            prime(n);
        }
    
    }
}