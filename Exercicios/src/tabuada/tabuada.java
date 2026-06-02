package tabuada;

import java.util.Scanner;

public class tabuada {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("tabuada");
        int numero = sc.nextInt();
        System.out.println("TABUADO DO " + numero);

        for (int i = 0; i <= 10; i++ ) {
            System.out.println(numero + "*" + i +  " = "  + numero * i);

        }


    }
}
