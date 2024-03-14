package Week2;

public class StaticMethod {
    public class Math{
        public static int add(int x, int y){
            return x+y;
        }

    }


    public static void main(String[] args) {
            int sum = Math.add(3,4);
            System.out.println(sum);
    }

}
