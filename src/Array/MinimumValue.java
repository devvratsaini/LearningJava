package Array;

public class MinimumValue {

    private static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 3, 15, 1, 2};
        System.out.println("Minimum value: " + findMinimum(arr));
    }
}
