package myself.programs.copy;

public class ChangeEvenIndexToUppercase {
		public static void main(String[] args) {
			//Declare a String
			String text="testleaf";

			//testleaf
			//TeStLeAf

			//Convert the String into character
			char[] charArray=text.toCharArray();
			//[t,e,s,t,l,e,a,f]

			//Iterate the character  from charArray
			for(int i=0; i<charArray.length; i++){
			//check  index value
			    if(i%2==0){
			      //t%2==0
			     //if it is satisfaction that condition 
			    //it will change the character into uppercase
			  char  EvenIndex=Character.toUpperCase(charArray[i]);
			  //print the odd index character
			    System.out.print(EvenIndex);
			   }
			  else{
				  //print the even character
			 System.out.print(charArray[i]);
			   }
		}
		}
		}


