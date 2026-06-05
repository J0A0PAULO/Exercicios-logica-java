package numeroDuasVezes;

import java.util.ArrayList;

public class NumeeroDuasVezes {
   public static void main(String[] args) {

        int []  nums = {1,2,3,1,2};

        ArrayList<Integer> numerosDuplicados = new ArrayList<>();

        for (int i = 0 ; i <nums.length; i++) {
            if (numerosDuplicados.contains(nums[i])) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    numerosDuplicados.add(nums[i]);
                    break;
                }
            }
        }
        System.out.println(numerosDuplicados);
    }
}
