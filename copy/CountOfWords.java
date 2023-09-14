package myself.programs.copy;

public class CountOfWords {
	
		public static void main(String[] args) {
			String text="Amazon has 20,000 employees in chennai";
			String[] split = text.split(" ");
			
			int count=0;
			for(int i=0; i< split.length; i++)
			{
			System.out.println(split[i]);
			count++;
			}
			System.out.println("words count"+count);
			}
		}
		
