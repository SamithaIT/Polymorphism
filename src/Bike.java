public class Bike {
    public void run(){
        System.out.println("Running");
    }
}
class YamahaZ extends Bike{
    @Override
    public void run() {
        System.out.println("Running 80km per hour");
    }

    public static void main(String[] args) {
        //polymorphism
        Bike b1=new YamahaZ();
        b1.run();
    }
}

//with override
