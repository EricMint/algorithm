package algorithm;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { -1, -100, 3, 99 };
        int[] numsForDesc = { -1, -100, 3, 99 };
        rotate(nums, 2);
        rotateByDesc(numsForDesc, 2);
    }

    private static void rotate(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                int newTemp = nums[i + 1];
                nums[i + 1] = temp;
                temp = newTemp;
            }

            nums[0] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void rotateByDesc(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i > 0) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = last;
                }
            }
        }


        System.out.println(Arrays.toString(nums));
    }
}