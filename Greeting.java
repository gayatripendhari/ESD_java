import java.util.*;
class Greeting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hellow");
        }else if(button==2){
            System.out.println("Namaste");
        }else if(button==3){
            System.out.println("Bonjour");
        }else{
                System.out.println("Please enter valid button");
            }
        }
    }
