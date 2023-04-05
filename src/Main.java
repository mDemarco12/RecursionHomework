import java.util.Scanner;

public class Main {

    public static int handShake(int n) {

        if ( n == 1) {

        return 0;

        } else if ( n == 2) {

            return 1;

        }else {
            return handShake(--n) + n;
        }
    }

    public static int task2(int n, int r) {
        if( r == 0 || r == n) {

       return 1;

        }else {

            return task2(n-1,r-1) + task2(n-1,r) ;
        }



    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("How many people are in the room: ");
        int input1 = scan.nextInt();

        System.out.println("If everyone shakes hands once, there will be "
            + handShake(input1) + " handshakes.");
        System.out.println();

        System.out.println("Enter value for n: ");

        int nm = scan.nextInt();

        System.out.println("Enter value for r: ");
        int rm = scan.nextInt();

        System.out.println("There are " + task2(nm,rm) + " possible combinations.");


    }
}