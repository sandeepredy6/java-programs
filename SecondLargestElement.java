public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 24, 1};

        // Check for edge cases where a second largest element cannot exist
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Initialize largest and second largest with the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {
            if (num > largest) {
                // If the current number is greater than the current largest,
                // the old largest becomes the new second largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // If the current number is between largest and secondLargest,
                // update secondLargest
                secondLargest = num;
            }
        }

        // Print the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements may be equal).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}