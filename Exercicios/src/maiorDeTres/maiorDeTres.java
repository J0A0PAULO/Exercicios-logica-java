package maiorDeTres;

import java.util.Scanner;

public class maiorDeTres {
    static void main() {

        Scanner sc =new Scanner(System.in);

        System.out.println("numero1");
        int numero1 = sc.nextInt();
        System.out.println("numero2");
        int numero2 = sc.nextInt();
        System.out.println("numero3");
        int numero3 = sc.nextInt();

        if(numero1 > numero2 && numero1 > numero3 ) {
            System.out.println(numero1 + "é  maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + "é maior");
        }else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + "é maior");
        }

    }
}
