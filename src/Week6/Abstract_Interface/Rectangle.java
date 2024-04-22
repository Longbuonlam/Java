package Week6.Abstract_Interface;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw " + color + " rectangle");
    }

}
