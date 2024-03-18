package Week2;

import java.util.Scanner;

public class CanBalance {
    private static final int MAX = 100 ;
    public static void main(String[] args) {
        int[] A = new int[MAX];
        int left = 0;
        int right = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang so nguyen, nhap q de thoat : ");
        for (int i = 0; i < MAX; i++) {
            if (scanner.hasNextInt()) {
                A[i] = scanner.nextInt();
                left += A[i];
            } else {
                break;
            }
        }
        for (int i = 0; i < A.length - 1; i++) {
            left -= A[i];
            right += A[i];
            if (left == right) {
                System.out.println("true");
                return;
            }

        }

        System.out.println("false");
    }
}
