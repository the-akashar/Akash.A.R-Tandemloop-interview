import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        for (int i = 0 ; i < a ;i=i+2){
            if (a-b==1){
                System.out.print(2 * i + a-(a-1));
                if (i < a-1) System.out.print(", ");
            } else {
                System.out.print(2 * i + a-(a-1));
                if (i < a-1) System.out.print(", ");
            }

        }
        sc.close();
    }
}
