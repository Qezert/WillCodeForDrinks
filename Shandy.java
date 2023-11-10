import java.util.Scanner;

public class Shandy {

    public static int min (int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int min = min(A, B);
        System.out.println(min * 2);
    }
}
