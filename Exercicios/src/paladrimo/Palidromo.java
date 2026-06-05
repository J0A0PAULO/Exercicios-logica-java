package paladrimo;

public class Palidromo {
    public static void main(String[] args) {

         String palavra = "arara";
        String palavraInvertida = "";
        boolean ok = false;

         for(int i = palavra.length() - 1; i  >= 0; i--) {
             palavraInvertida += palavra.charAt(i);
             if (palavra.equals(palavraInvertida)) {
                 ok = true;
             }
         }
        System.out.println(ok);

    }
}
