package Week1;

public class TestArray {
    public static void main(String[] args) {
        int[] MyList = {1, 2, 23, 25};
        for (int i = 0; i < MyList.length; i++) {
            System.out.println(MyList[i]);
        }

        int Total = 0;
        for (int i = 0; i < MyList.length; i++) {
            Total = Total + MyList[i];
        }
        System.out.println("Total is: "+Total);

        int Max = 0;
        for (int i = 0; i < MyList.length; i++) {
            if (MyList[i] > Max) {
                Max = MyList[i];
            }
        }
        System.out.println("Max is: "+Max);
    }
}
