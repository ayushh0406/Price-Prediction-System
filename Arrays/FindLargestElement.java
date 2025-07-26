// Find the largest element in an array
// Time Complexity: O(n), Space Complexity: O(1)

public class FindLargestElement {
    
    // Method to find the largest element in array
    public static int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 5, 4, 1, 9};
        int[] arr2 = {10, 20, 4};
        int[] arr3 = {1, 2, 3, 4, 5};
        
        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Largest element: " + findLargest(arr1));
        
        System.out.println("\nArray 2: " + java.util.Arrays.toString(arr2));
        System.out.println("Largest element: " + findLargest(arr2));
        
        System.out.println("\nArray 3: " + java.util.Arrays.toString(arr3));
        System.out.println("Largest element: " + findLargest(arr3));
    }
}
