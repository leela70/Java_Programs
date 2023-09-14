package myself.programs.copy;

	public class ReverseString {
	public static void main(String[] args) {
		String text="the sky is blue";
		//to get the size of given String
		int length = text.length();
		
		System.out.println(length);
		//Convert the String into character
		char[] charArray = text.toCharArray();
		//Iterate the values from char Array
		for (int i =charArray.length-1;i>=0; i--) {
			//Print the character
			System.out.print(charArray[i]);
		}
		

}}