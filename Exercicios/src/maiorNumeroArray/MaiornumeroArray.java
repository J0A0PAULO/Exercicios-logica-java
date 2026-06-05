package maiorNumeroArray;

public class MaiornumeroArray {
    static void main(String[] args) {

        int [] nums = {3,1,7,2,9,4};
        int maior = 0;

        for (int i = 0; i < nums.length; i++) {

           if (nums[i] > maior) {
               maior = nums[i];
           }
        }
        System.out.println(maior);
    }
}
