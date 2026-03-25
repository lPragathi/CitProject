class Animal{

}
class Tiger{

}


public class Instanceofoperator {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal as = new Animal();
        Animal tg = new Animal();


        System.out.println(an instanceof Animal);
        System.out.println(as instanceof Animal);
        //it is not allowed
        System.out.println(tg instanceof Animal);

    }
    //java is to check whether the object belongs to particular class or interface at runtime

}
    
