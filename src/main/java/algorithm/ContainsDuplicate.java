package algorithm;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        boolean containsDuplicateNumber = containsDuplicate(nums);
        System.out.println("The array nums contains duplicated numbers: " + containsDuplicateNumber);
        boolean containsDuplicateNumber2 = containsDuplicate(nums2);
        System.out.println("The array nums2 contains duplicated numbers: " + containsDuplicateNumber2);
    }

    private static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}