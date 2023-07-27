import java.util.*;
class CBSE_Result{
    public static void main(String[] args) {
        float sub,spga,sum=0;
        int total =500 ;
  //sub2,sub3,sub4,sub5
        int i;
        System.out.println("Enter marks for the subjects one by one: ");
        Scanner sc = new Scanner(System.in);
        for( i=1;i<=5;i++){
            System.out.print("Sub"+i+"= ");
            sub= sc.nextInt();
            sum +=sub;

        }
        System.out.println("total obatained marks out of 500 is "+sum);
        spga= sum/total * 100;
        if(spga>=70){
            System.out.println("Congrates..!You have obtained first class and distinction with "+spga+"%");
        }else if(spga>=60 && spga<=69){
            System.out.println("Congrates..!You have obtained first class with "+spga+"%");
        }else if(spga>=50 && spga<=59){
            System.out.println("Congrates..!You have obtained second class with "+spga+"%");
        }else if(spga>=45 && spga<=49){
            System.out.println("Congrates..!You are passes out successfully with "+spga+"%");
        }else{
            System.out.println("Try next time...You'll definetely do it..!");
        }
    }
}