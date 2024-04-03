package Week4.InnerClass;
import Week4.InnerClass.Outer_Demo;

public class JavaPackage {
    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo();
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
        System.out.println("This is a package");
    }
}
