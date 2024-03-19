package Week2;

import java.util.Scanner;

public class FixArraySolution {
    private static final int MAX = 100;

    public static void main(String[] args) {

        int[] A = new int[MAX];
        int[] index3 = new int[MAX];
        int[] index4 = new int[MAX];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang so nguyen, nhap q de tiep tuc chuong trinh : ");
        for (int i = 0; i < MAX; i++) {
            if (scanner.hasNextInt()) {
                A[i] = scanner.nextInt();
            } else {
                break;
            }
        }
        int ci3 = 0, ci4 = 0;
        for(int i=0; i< A.length-1; i++){
            if(A[i] == 3){
                index3[ci3] = i;
                ci3++;
            }
            if(A[i] == 4){
                index4[ci4] = i;
                ci4++;
            }
        }
        for(int i=0; i<ci3 ;i++){

            int tmp = A[index3[i]+1];
            A[index3[i]+1] = 4;
            A[index4[i]] = tmp;

        }
        System.out.println("\nMang da sua lai la: ");
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] != 0 ){
                System.out.println(A[i]+" ");
            }
        }

    }
}
