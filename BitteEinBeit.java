import java.util.Scanner;

class BitteEinBeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.contains("0")) {
            System.out.println("0");
            
        } else if(input.contains("1"))  {
            System.out.println("1");
        }
    }
}