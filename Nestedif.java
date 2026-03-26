import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // age = 65;
        System.out.println("Enter the age");
        int age = sc.nextInt();
        
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to avail government fund");
            }else
                System.out.println("We are not eligible for government scheme");
        } else
        System.out.println("We are not eligible to vote");

    }
}
    

