package myself.programs.copy;
public class Target {
public static void main(String[] args) {
	int[] numbers = { 2, 7, 1, 8, 4, 5 };
    int target = 8;

    // Flag to keep track if the target is found
    boolean found = false;

    // Iterate through the array
    for (int i = 0; i < numbers.length; i++) {
        // Check if the current element matches the target
        if (numbers[i] == target) {
            System.out.println("Target found at index " + i);
            found = true;
            break; // Exit the loop once the target is found
        }
    }

    // If the target is not found, print a message
    if (!found) {
        System.out.println("Target not found in the array");
   }

}}