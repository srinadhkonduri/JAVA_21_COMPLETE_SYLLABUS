public class Array_Operations {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] example = {23, 43, 56, 45, 67, 76, 76, 89, 87, 90, 98, 98, 41};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int j : example) {
            if (j > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                thirdLargest = secondLargest;
                secondLargest = j;
            } else if (j > thirdLargest && j != secondLargest) {
                thirdLargest = j;
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
    }
}
