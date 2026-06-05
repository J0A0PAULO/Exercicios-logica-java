package doisSomam;

import java.util.ArrayList;

public class DoisSomam {
    public static void main(String[] args) {

        int [] nums = {2,7,11,15};
        int target = 9;

        ArrayList<Integer> posicao = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    posicao.add(i);
                    posicao.add(j);
                }
            }
        }
        System.out.println(posicao);



    }
}
