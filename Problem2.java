import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        for (int i = 0 ; i < a ; i++){
            System.out.print(2 * i + a-(a-1));
            if (i < a-1) System.out.print(", ");
        }
        sc.close();
    }
}
