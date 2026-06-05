package somaArray;

public class SomaArray {
    static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        int somaArray = 0;

        for (int i = 0; i < nums.length; i++) {
            somaArray+= nums[i];
        }
        System.out.println(somaArray);
    }
}
