package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class FixArray {
    private static final int MAX = 100;

    public static void main(String[] args) {

        int[] A = new int[MAX];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang so nguyen, nhap q de tiep tuc chuong trinh : ");
        for (int i = 0; i < MAX; i++) {
            if (scanner.hasNextInt()) {
                A[i] = scanner.nextInt();
            } else {
                break;
            }
        }

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] == 3) {
                for (int j = i - 1; j < A.length - 1; j++) {
                    if (A[j] == 4) {
                        int b = A[i + 1];
                        A[i + 1] = A[j];
                        A[j] = b;
                    }
                }
            }
        }
        //Truong hop 3 dung dau tien
        if(A[0] == 3){
            for (int j =1; j < A.length - 1; j++) {
                if (A[j] == 4) {
                    int b = A[1];
                    A[1] = A[j];
                    A[j] = b;
                }
            }
        }
        System.out.println("\nMang da sua lai la: ");
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] != 0 ){
                System.out.println(A[i]+" ");
            }
        }
    }
}
