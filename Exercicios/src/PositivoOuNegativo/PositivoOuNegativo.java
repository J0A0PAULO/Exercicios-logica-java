package PositivoOuNegativo;

import java.util.Scanner;

public class PositivoOuNegativo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero e descubra se positivo ou negativo");
        int numero  = sc.nextInt();

        if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero +" é negativo");
        }

    }
}
