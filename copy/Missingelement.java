package myself.programs.copy;
import java.util.Arrays;
public class Missingelement {
public static void main(String[] args) {
	// 1.Declare an array num and assign the values
	int[] arr = {1,2,3,4,6,7,8};
	// 2.Sort the array	
	Arrays.sort(arr);
	//3.Convert the array into string and print it
	for(int i=0;i<arr.length;i++) {
		//4.iterate a for loop from 0 to the length of the array
		if(arr[i]!=i+1)
		{
			// 5.break the loop if the condition gets satisfied
			System.out.println(i+1);
			break;
	}
}
}}
