package algorithm;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 4, 4, 5, 5 };
        int count = removeDuplicates(array);
        System.out.println(count);
    }

    private static int removeDuplicates(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[count] != array[i]) {
                count++;
                array[count] = array[i];
            }
        }

        return count + 1;
    }
}