
    public class LinearSearchExample {

    public static int linearSearch(int[] arr, int target) {
        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the target is not in the array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 43, 78, 5, 91, 12, 11};
        int targetElement = 11;

        int resultIndex = linearSearch(numbers, targetElement);

        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}

