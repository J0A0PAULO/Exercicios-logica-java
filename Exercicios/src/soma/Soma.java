package soma;

import java.util.Scanner;

public class Soma {
    static void main() {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite numero 1");
        int n1  = sc.nextInt();

        System.out.println("digite numero 2");
        int n2  = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("resuldado da soma");
        System.out.println(soma);
    }
}