package Dobro;

import java.util.Scanner;

public class Dobro {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite numero e saiba seu dobro");
        int numero = sc.nextInt();

        int dobro = numero * 2;

        System.out.println("dobro de " + numero + " é " + dobro);
    }
}
