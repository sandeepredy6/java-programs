
    import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] numbers = {5,0, 2, 8, 1, 9};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers); // Sort the array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

