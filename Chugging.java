import java.util.Scanner;


class Chugging1{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        int bottles = sc.nextInt();
        sc.nextLine();
        int ta = sc.nextInt();
        int da = sc.nextInt();
        sc.nextLine();
        int tb = sc.nextInt();
        int db = sc.nextInt();
        sc.close();
        int alice = 0; 
        int bob= 0;

        for(int i = 0; i <= bottles-1; i++){
            alice += da * i + ta; 
        }
        for(int i = 0; i <= bottles-1; i++){
            bob += db * i + tb; 
        }
       
        
        
        
        if(alice > bob){
            System.out.println("Bob");
        } else if (bob > alice){
            System.out.println("Alice");
        } else{
            System.out.println("=");
        }

    }

}
public class Chugging {

    public static int calcTime (int noOfBeers, int init, int add) {
        int result = 0;
        for (int i = 0; i < noOfBeers; i++) {
            result = result + init + (i * add);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(calcTime(3, 8, 4));

        int noOfBeers = sc.nextInt();
        int Alice;
        int AliceInit = sc.nextInt();
        int AliceAdd = sc.nextInt();
        int Bob;
        int BobInit = sc.nextInt();
        int BobAdd = sc.nextInt();

        Alice = calcTime(noOfBeers, AliceInit, AliceAdd);
        Bob = calcTime(noOfBeers, BobInit, BobAdd);
        
        if (Alice > Bob) {
            System.out.println("Bob");
        } else if (Bob > Alice) {
            System.out.println("Alice");
        } else {
            System.out.println("=");
        }
    }

}