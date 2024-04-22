package Week6.Abstract_Interface;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw " + color + " circle");
    }

}
