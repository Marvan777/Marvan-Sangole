public class MySelectionSort {
    public static void main(String[] args) {
        int[] array = {52, 18, 37, 9, 64};
        
        //Print array before sorting
        System.out.print("Before Sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int totalSwaps = 0;
        int n = array.length;

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            System.out.println("--- Pass " + (i + 1) + " ---");
            
            int minIndex = i;
            //Print assumed minimum at start
            System.out.println("Assumed minimum: " + array[minIndex] + " at index " + minIndex);
            
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    //Print when new minimum is found
                    System.out.println("New minimum found: " + array[minIndex] + " at index " + minIndex);
                }
            }
            
            
            if (minIndex != i || i == 1) { 
                System.out.println("Swapped: " + array[minIndex] + " to index " + i);
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
                totalSwaps++;
            }
            
            //Print array after every pass
            System.out.print("Array after Pass " + (i + 1) + ": ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        //Print total swaps at the end
        System.out.println("Total Swaps: " + totalSwaps);
        
        //Print final sorted array
        System.out.print("After Sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}