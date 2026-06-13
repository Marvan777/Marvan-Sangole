public class MyLinearSearch {
    public static void main(String[] args) {
        // Given data 
        int[] array = {33,8,71,19,56,44,27};
        int target = 56;
        
        int foundIndex = -1; 
        int totalSteps = 0;

        System.out.println("Linear Search");

        // Loop through the array to find the target
        for (int i = 0; i < array.length; i++) {
            totalSteps++; // Increment 
            
            // Print each individual step requirement
            System.out.println("Checking index " + i + " Value " + array[i] );
            
            if (array[i] == target) {
                foundIndex = i; 
                break;  // Target found
            }
        }
        // Print final status
        if (foundIndex != -1) {
            System.out.println("Found at index " + foundIndex);
        } else {
            System.out.println("Result: Not Found");
        }
        
        System.out.println("Total steps = " + totalSteps);
    }
}