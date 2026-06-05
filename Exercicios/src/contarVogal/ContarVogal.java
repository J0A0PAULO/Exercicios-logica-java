package contarVogal;

public class ContarVogal  {
   public static void main(String[] args) throws Exception {
        String str = "leetcode";
        String [] letras = str.split("");
        int contador =0;

        for(int i = 0; i < letras.length; i++ )  {

            if (letras[i].equals("a") || letras[i].equals("e") ||letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")|| letras[i].equals("aõ"))  {
                contador++;
            }

        }
        System.out.println(contador);
    }

}
