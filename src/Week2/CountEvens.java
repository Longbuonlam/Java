package Week2;

import java.util.Scanner;

public class CountEvens {
    private static final int MAX = 100 ;
    public static void main(String[] args) {
        int count = 0;
        int[] A = new int[MAX];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang so nguyen, nhap khac so nguyen de thoat : ");
        for(int i =0; i < MAX; i++) {
            if (scanner.hasNextInt()) {
                A[i] = scanner.nextInt();
                if (A[i] % 2 == 0) {
                    count++;
                }
            } else {
                break;
            }
        }
        System.out.println(count);
        //continue, LABEL
    }
}
