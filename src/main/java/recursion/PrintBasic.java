package recursion;

public class PrintBasic {


    private static void print1ToN(int n){



        // base condition
        if(n<=0){
            return;
        }

        // induction start
        print1ToN(n-1); // hypothesis print1toN(n-1) will print from 1 to n-1
        System.out.println(n);
        // induction end
    }


    private static void printNto1(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }


    public static void main(String[] args) {
        System.out.println("Printing 1 to n");
        print1ToN(10);
        System.out.println("Printing n to 1");
        printNto1(15);
    }
}
