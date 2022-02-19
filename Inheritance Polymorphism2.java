class monkey{
    void jump(){
        System.out.println("Monkey jumps");
    }
    void bite(){
        System.out.println("Monkey bites");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("Human eats");
    }
    public void sleep(){
        System.out.println("Human sleeps");
    }
}


public class Abstract_CWH_Q2 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jump();
    }
}
