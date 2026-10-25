package array;

public class FindMaximumDifference {

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        int min = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum difference: " + maxDiff);
    }
}