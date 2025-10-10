/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package algorithms.Recursion;

/**
 *
 * @author Legop
 */
public class FibonacciExample {


    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibonacciEfficient(n));

        
        
    }

    // The first example handles the first two fine, but the return gets slowed down and unable to handle larger size integers such n = 100;


    private static int fibonnaciExampleOne(int i){
        if( i == 0) 
            return 0;
        if(i == 1)
            return 1;
        return fibonnaciExampleOne(i - 1) + fibonnaciExampleOne(i - 2);

    }

    // This longs through th esize of the n and chews it down far simplier
    // 5  
    // i = 2
    // 2 + 1 = 0, 0 
    // Note the memo[i - 1 ] is calling back its index. So the previous answers.

    private static long fibonacciEfficient(int n) {
            long[] memo = new long[n + 1];
            memo[0] = 0;
            if (n > 0) memo[1] = 1;
            for (int i = 2; i <= n; i++) {
                System.out.println("The fib calculation is = " + memo[i - 1] + " + " + memo[i - 2]);
                memo[i] = memo[i - 1] + memo[i - 2];
                System.out.println("This element is: " + memo[i]);
            }
            return memo[n];
        }

}
