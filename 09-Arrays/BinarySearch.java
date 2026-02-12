import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // A sorted array is required for Binary Search
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
        
        int low = 0;
        int high = numbers.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (numbers[mid] == target) {
                result = mid;
                break;
            }
            if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        sc.close();
    }
}