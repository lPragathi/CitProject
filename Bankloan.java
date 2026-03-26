import java.util.Scanner;
public class Bankloan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int salary;
        System.out.println("Enter the age for user");
        age = sc.nextInt();
        System.out.println("Enter the salary for user");
        salary = sc.nextInt();
        if(age>=21 && salary>=21000 )
            System.out.println("Eligible for loan");
        else
            System.out.println("Not eligible for bank loan");
        sc.close();

        }
    
}
