package contagemRegressiva;

import java.util.Scanner;

public class ContagemRegressiva {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("digite numero da contagem regressiva");
        int numero = sc.nextInt();

        for (int i = 0 ; i < numero ; i++) {
            System.out.println(numero - i);
        }

    }
}
