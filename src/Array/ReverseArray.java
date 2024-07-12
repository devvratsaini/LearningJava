package Array;

public class ReverseArray {

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // simpler but less efficient
    private static void reverseFull(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }

    private static void reverseBetween(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 11, 5, 10, 7, 2};

        System.out.print("Original arr: \t");
        printArray(arr);

        System.out.print("Reverse b/w: \t");
        reverseBetween(arr, 1, 3);
        printArray(arr);

        System.out.print("Reverse full: \t");
        reverseFull(arr);
        printArray(arr);
    }
}
