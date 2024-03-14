package Week2;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao str: ");
        str = scanner.nextLine();

        char firstchar = str.charAt(0);
        char lastchar = str.charAt(str.length()-1);

        int key;
        char f = 'f';
        char b = 'b';

        if((firstchar ==f) && (lastchar == b)){
            key = 3;
        }else if(lastchar == b){
            key = 2;
        }else if (firstchar ==f){
            key = 1;
        }else{
            key = 4;
        }

        switch(key){
            case 1: System.out.println("Fizz"); break;
            case 2: System.out.println("Buzz"); break;
            case 3: System.out.println("FizzBuzz"); break;
            case 4: System.out.println(str); break;
        }



    }
}
