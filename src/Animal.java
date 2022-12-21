public class Animal {
    public void eat(){
        System.out.println("Eating");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating fish");
    }
}
class Cow extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}
class BabyCat extends Cat{
    @Override
    public void eat() {
        System.out.println("Eating small fish");
    }
}
//main method
class TestPolymorphism{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        //polymorphism
        Animal a1=new Cat();
        a1.eat();
        Animal a2=new Cow();
        a2.eat();
        Cat c1=new BabyCat();
        c1.eat();

        Animal a3;
        a3=new BabyCat();
        a3.eat();
    }
}
