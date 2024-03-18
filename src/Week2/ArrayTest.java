package Week2;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayTest {
    public static void main(String[] args) {
        int[] A = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang (toi da 10 ptu) : ");
        for(int i =0; i < 10;i++){
           A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
