public class inheritance {
    public static void main(String args[]) {
        //Fish shark = new Fish();
        //shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
class Animal{
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

// dearived class
//class Fish extends Animal {
  //  int fins;

   // void swim() {
   //     System.out.println("swims in water");
 //   }
//}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String bread;
}
