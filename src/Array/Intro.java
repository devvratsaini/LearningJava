package Array;

public class Intro {

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] new_arr = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                new_arr[idx++] = arr[i];
            }
        }
        return new_arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};

        System.out.print("Original array: ");
        printArray(arr);

        arr = removeEven(arr);
        System.out.print("Evens removed: \t");
        printArray(arr);
    }
}
