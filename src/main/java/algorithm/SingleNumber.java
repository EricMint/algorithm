package algorithm;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = { 2, 2, 1 };
        int[] nums2 = { 2, 3, 4, 3, 4, 2, 1 };
        int[] nums = { 4, 1, 2, 1, 2 };
        int singleNumber = getSingleNumber(nums);
        System.out.println(singleNumber);

    }

    private static int getSingleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if ((i != j) && (nums[i] == nums[j])) {
                    isSingle = false;
                    break;
                }
            }

            if (isSingle) {
                return nums[i];
            } else {
                continue;
            }
        }

        return nums[nums.length - 1];
    }
}