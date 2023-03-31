/*
*Count.java
*C.Timmins
*27/03
*develop an app to accept string and output amount of vowels in that string
*/

public class Count{
	private String input;
	private int v;

	//constructor
	public Count(){
		input =" ";
		v =0;
	}
	public void setCount(String input){
		this.input = input;
	}

	//compute methods
	public void compute(){
		input =input.toLowerCase();
		for(int i =0; i < input.length();i ++){
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
				v++;
			}
		}
	}
	public int getV(){
		return v;
	}
}
