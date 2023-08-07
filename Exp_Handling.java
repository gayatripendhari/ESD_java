import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Exp_Handling {
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);  
        String S = sc.nextLine();
        try
        {
            int no;
            no = Integer.parseInt(S);
            System.out.println(no);
        }
        catch(Exception a)
        {
            System.out.println("Bad String");
        }          
    }
}
