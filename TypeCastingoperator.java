public class TypeCastingoperator {
    public static void main(String[] args) {
        double d=9.78;

        //explicit type conversion
        int num = (int)d;
        System.out.println("Double value before conversion:" +d);
        System.out.println("After explicit type conversion:" +num);
        //implicit conversion
        int i = 5;
        double x = i;
        System.out.println("before:" +i);
        System.out.println("After implicit:" +x);
        
    }

    
}
