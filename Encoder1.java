/*
*Encoder1.java
*author @C.Timmins & Oisin McC
*4/4/23
*/
public class Encoder1{
	private String input;
	private String rev;
	private StringBuffer strBuff;
	private String output;

	public Encoder1(){
		input = " ";
		rev = " ";
		output = " ";
		strBuff = new StringBuffer();
	}
	public void setInput(String input){
		this.input = input;
	}
	//compute method
	public void compute(){
		for(int i = input.length()-1; i >= 0; i--){

			if(input.charAt(i)=='a'){
				strBuff.append('1');
			}
			else if(input.charAt(i)=='e'){
				strBuff.append('5');
			}
			else if(input.charAt(i)=='i'){
				strBuff.append('9');
			}
			else if(input.charAt(i)=='o'){
				strBuff.append("15");
			}
			else if(input.charAt(i)=='u'){
				strBuff.append("21");
			}
			else{
				strBuff.append(input.charAt(i));
			}
		  output = strBuff.toString();
		}
	}


	public String getOutput(){
		return output;
	}
}

