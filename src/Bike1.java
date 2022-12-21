public class Bike1 {
    int speed_limit= 60;
}
class Honnert extends Bike1{
    int speed_limit=90;

    public static void main(String[] args) {
        //polymorphism
        Bike1 b=new Honnert();
        System.out.println(b.speed_limit);
    }
}

//without override
