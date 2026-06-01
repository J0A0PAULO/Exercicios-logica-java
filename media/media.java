package media;

import java.util.Scanner;

public class media {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero1");
        double n1 = sc.nextInt();
        System.out.println("Digite numero2");
        double n2 = sc.nextInt();
        System.out.println("Digite numero3");
        double n3 = sc.nextInt();

        double media = (n1 + n2  + n3) / 3;

        System.out.println("A media é " + media);


    }
}
