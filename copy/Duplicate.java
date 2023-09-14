package myself.programs.copy;

public class Duplicate {
public static void main(String[] args) {
	//1.declare the variable as num and assign the values
	int[]num= {1,4,5,2,6,2,9,3,5,1};
	//2.loop through the array from 0 till the length of an array
	for(int i=0;i<num.length;i++) {
		//3.loop through the array from i+1 till the length of an array
		for(int j=i+1;j<num.length;j++) {
			//4.check the condition
			if(num[i]==num[j])
			{
				//5.print num i if the condition is true

				System.out.println(num[i]);	
		}
		
		}
}
	
}}