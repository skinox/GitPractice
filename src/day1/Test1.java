package day1;
import java.util.*;
public class Test1 {

    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int x = scan.nextInt();
            countDown(x);



    }

    /**
     * Count down from a given number
     *
     * @param x The number to count down from
     */
    private static void countDown(int x){
        try {
            for (int i = x; i > 0; i--) {
                System.out.println(i);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Sorry error");
        }
        System.out.println("💥");
    }
}
