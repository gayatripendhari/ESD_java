import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("***************** Welcome To Oue School *****************");
        System.out.println("        1.Enter your marks out 100 ");
        System.out.println("        2.Quit ");
        System.out.println("Enter your Choice:");
        int choice = s1.nextInt();
        switch (choice) {
            case 1:
                    System.out.println("Enter your marks: ");
                    int mark = s1.nextInt();
                    if(mark>=90){
                        System.out.println("This is Good");
                    }else if(mark>=60 && mark<=89){
                        System.out.println("This is also good");
                    }else if(mark>=59 && mark==0){
                        System.out.println("This is good as well");
                    }
                
                break;
            case 2:
                    System.out.println("Have a great day ahead");
                    break;
        
            default:
                    System.out.println("Marks Doesn't matter but our effort does");
                break;
        }
    }
}