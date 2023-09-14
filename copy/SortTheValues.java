package myself.programs.copy;

import java.util.Arrays;

public class SortTheValues {
public static void main(String[] args) {
	//1.declare the variable as numbers and assign values
	int []numbers= {10,30,20,50,40};
	//10,20,30,40,50
	//2.sort the numbers
	Arrays.sort (numbers);
	//3.convert the arrays into string amd print the values 
	System.out.println(Arrays.toString(numbers));
	//4.iterate the values from 0 till length of an array
	for(int i=0; i<numbers.length; i++)
	{
		//5.print number i
		System.out.println(numbers[i]+"");
	}
}
}
 
		