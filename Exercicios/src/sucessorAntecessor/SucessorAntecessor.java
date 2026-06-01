package sucessorAntecessor;

import java.util.Scanner;

public class SucessorAntecessor {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero e saiba seu antecessor e sucessor");
        int numero = sc.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero -1;

        System.out.println("antecessor de " + numero + " é " + antecessor + " e seu sucessor é  " + sucessor);

}
}
