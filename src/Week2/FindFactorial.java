package Week2;


import java.util.Scanner;


public class FindFactorial {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

