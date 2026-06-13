public class MyBinarySearch {
    public static void main(String[] args) {
        // Given data 
        int[] array = {9,21,34,48,57,66,83};
        int target = 66;

        int left = 0;
        int right = array.length - 1;
        
        boolean found = false;
        int totalSteps = 0;
        int foundIndex = -1;

        System.out.println("Binary Search");

        // Loop runs as long as the search space is valid
        while (left <= right) {
            totalSteps++;
            
            // Calculate mid-point
            int mid = left + (right - left) / 2;
            int currentValue = array[mid];

            // Print Left, Right, Mid and Value at each step
            System.out.println("Left = " + left + 
                               ", Right = " + right + 
                               ", Mid = " + mid + 
                               ", Value = " + currentValue);

            // Check if target is found
            if (currentValue == target) {
                found = true;
                foundIndex = mid;
                break; // Target found
            }
            
            // If target is smaller, ignore right half
            if (currentValue > target) {
                right = mid - 1;
            } 
            // If target is larger, ignore left half
            else {
                left = mid + 1;
            }
        }
        // Print Found or Not Found
        if (found) {
            System.out.println("Found at index " + foundIndex);
        } else {
            System.out.println("Not Found");
        }

        // Print total steps taken
        System.out.println("Total steps = " + totalSteps);
    }
}