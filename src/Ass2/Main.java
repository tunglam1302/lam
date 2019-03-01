package Ass2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sumFib = 0;
        for (int i = 0; i < n  ; i++) {
            if(prime(i) != 0) {
                System.out.print(prime(i) + " ");
            }
            sumFib+=fib(i);
        }
        System.out.println("\n");
        System.out.println("Sum = "+sumFib);;
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int prime(int n){
        if(n == 2){
            return n;
        }
        if( n > 2){
            for(int i = 2; i < n ;i++){
                if(n%i!=0){
                    return n;
                }
                else{
                    return 0;
                }
            }
        }
        return 0;
    }
}
