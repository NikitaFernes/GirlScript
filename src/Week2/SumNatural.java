package Week2;

import java.util.Scanner;

public class SumNatural {
    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt(); int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

