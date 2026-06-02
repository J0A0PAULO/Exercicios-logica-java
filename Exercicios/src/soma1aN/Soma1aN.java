package soma1aN;

import java.util.Scanner;

public class Soma1aN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite numeero para somar");
        int numero = sc.nextInt();
        System.out.println("valor da soma");

        int valor = 0;

        for (int i = 0; i <= numero; i++) {
            valor+= i;
            System.out.println(valor);
        };
    }
}
