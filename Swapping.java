public class Swapping {
    public static void main(String[] args) {
        int number = 25;
        int swap =0;
        while(number != 0){
            int digit = number % 10;
            swap = swap * 10 + digit;
            number = number / 10;

        }
        System.out.println("Swapped number is: " + swap);
    }
    
}
