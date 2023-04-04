/*
*Palindrome.java
*@author O.McGillicuddy
*3/4/23
*/

public class Palindrome{
	private String input;
	private String reverse;
	private String output;
	private StringBuffer strBuff = new StringBuffer();

	public Palindrome(){
		input = " ";
		reverse = " ";
		output  = " ";
	}

public void setInput(String input){
	this.input = input;
}

	public void compute(){
		for(int i = input.length()-1;i>=0;i--){
			strBuff.append(input.charAt(i));
		}
		reverse = strBuff.toString();
			if(reverse.equalsIgnoreCase(input)){
				output= "is";
			}
			else{
				output = "is not";
			}
	}

	public String getOutput(){
		return output;
	}
}