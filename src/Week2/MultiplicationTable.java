package Week2;

import java.util.Scanner;

public class MultiplicationTable {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication number");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

