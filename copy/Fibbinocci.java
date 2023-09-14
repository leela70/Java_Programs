package myself.programs.copy;

public class Fibbinocci {
public static void main(String[] args) {
	//1.initialize firstNum,secondNum and sum and assign 0,1,0
	int firstNum=0;
	int secondNum=1;
	int sum=0;
	//2.print the firstNum
	System.out.println(firstNum);
	//3.iterate the values from zero till 10 
	for(int i=0;i<=11;i++)
	{
		//4.add firstNum and secondNum and assign to sum
		//5.assign firstNum to secondNum
		//6.assign secondNum to sum
		sum=firstNum+secondNum ;
		firstNum = secondNum ;
		secondNum=sum ;
		//7.print the sum
		System.out.println(sum);
	}
}
	
	
	
}
