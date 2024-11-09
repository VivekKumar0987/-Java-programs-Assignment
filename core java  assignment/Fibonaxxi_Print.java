
import java.io.*;
import java.util.Scanner;

class Fibonaxxi_Print {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println("Fibonaxxi sequence upto "+n+" terms::");
        // Function Call
        Fibonacci(n);
    }
}