package Array;

public class SecondMinValue {

    private static int findSecondMin(int[] arr) {
        int min = MinValue.findMin(arr);
        int sec_min = arr[0];
        for (int num: arr) {
            if (sec_min > num && num > min) {
                sec_min = num;
            }
        }
        return sec_min;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 34, 33, 1};
        System.out.println("Second minimum: " + findSecondMin(arr));
    }
}
