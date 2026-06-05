package fatorial;

import java.util.Scanner;

public class Fatorial {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("digite um numero e descubra seu fatorial");
        int numero = sc.nextInt();

        int acumulador = 1;

        for (int i = numero; i >= 1; i--) {
           acumulador*= i;
        };
        System.out.println(acumulador);
    }
}
