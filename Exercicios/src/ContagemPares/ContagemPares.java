package ContagemPares;

public class ContagemPares {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int contador = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
