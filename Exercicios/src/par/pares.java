package par;

import java.util.Scanner;

public class pares {


    static void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("digite um numero e dusbra se numero e par ou impar");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("numero par");
    } else {
        System.out.println("numero impar");
    }

    }

}
