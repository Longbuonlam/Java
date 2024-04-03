package Week4.Inheritance;

interface Animal{

}
//the implements keyword is used with classes to inherit the properties of an interface
//Interfaces can never be extended by a class
class Mammal implements Animal{

}
class Reptile extends Mammal{

}
public class Dog extends Mammal{
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Dog d = new Dog();

        //use the instanceof operator to check determine whether Mammal is actually an Animal, and dog is actually an Animal
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
