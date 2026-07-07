package dsa.arrays;

public class arrMax {
    public static void main(String[] args) {
        int[] arr = {112, 3, 12, 20, 19, 17, 67};
        System.out.println(max(arr));
        System.out.println(maxinRange(arr, 2, 4));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxinRange(int[] arr, int start, int end) {
        int max = arr[0];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

