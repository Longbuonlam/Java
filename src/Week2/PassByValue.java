package Week2;

public class PassByValue {
    public static class Value {
        public int num;
        public Value(int num){
            this.num = num;
        }
    }

    public static void modify(Value x, Value y){
        x.num += 1;
        y = new Value(1);
        y.num += 1;
    }

    public static void main(String[] args) {
        Value x = new Value(1);
        Value y = new Value(1);

        modify(x,y);

        System.out.println(x.num);
        System.out.println(y.num);
    }
}
