package Array;

public class MinValue {

    protected static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        System.out.println("Minimum value: " + findMin(arr));
    }
}
