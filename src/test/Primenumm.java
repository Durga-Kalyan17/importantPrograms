package test;

import java.util.Scanner;

public class Primenumm {
     public static void main(String[] args) {
          System.out.println("Enter the Number :-");
          Scanner s = new Scanner(System.in);
          int limit = s.nextInt();
          for (int i = limit; i >= 1; i--) {
               if (primes(i, i - 1) == 1) {
                    System.out.println(i + " is a prime no");
               } else {
                    System.out.println(i + " is not a prime no");
               }
          }
     }

     private static int primes(int x, int i) {
          if (i == 1) {
               return 1;
          }
          try {
               if (x % i == 0) {
                    return 0;
               } else {
                    return primes(x, i - 1);
               }
          } catch (Exception e) {
               return 1;
          }
     }
}