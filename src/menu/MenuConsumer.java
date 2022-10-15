package menu;

import java.util.Scanner;

public class MenuConsumer {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Please input your integer: ");
       int n1 = scanner.nextInt();
       System.out.printf("Your input number is %d", n1).println();

       scanner.close();

       Menuprovider menu = new Menuprovider();
   }
} 
