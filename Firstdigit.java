
public class Firstdigit {
    public static void main(String[] args) {
        int number=1009;
        while(number >= 10){
            number = number / 10;
        }
        System.out.println("First digit is:" +number);
        
        
    }
    
}
