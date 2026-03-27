import java.util.Scanner;
public class Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit;
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
        if(num>=10 && num<=99){
            digit=num % 10;
            System.out.println("Last digit:" +digit);}
            else{
                System.out.println(num);
                sc.close();

            }


        }
    
}
