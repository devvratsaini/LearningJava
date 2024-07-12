package Array;

public class Max_SecondMax_Values {

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num: arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    private static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        int second_max = arr[0];
        for (int num: arr) {
            if (second_max < num && num < max) {
                second_max = num;
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 34, 33, 1};
        System.out.println("Max value: " + findMax(arr));
        System.out.println("Second max value: " + findSecondMax(arr));
    }
}
