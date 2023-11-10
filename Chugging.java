import java.util.Scanner;

class Chugging{
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