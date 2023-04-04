/*
*Encoder1App.java
*C.Timmins & Oisin McC
*04/04/23
*/

import javax.swing.JOptionPane;
public class Encoder1App{
	public static void main(String args[]){
	//inputs
	String input, rev, output;

	Encoder1 myEncoder = new Encoder1();

	input= JOptionPane.showInputDialog(null,"Enter your one word message here please:");
		myEncoder.setInput(input);

		myEncoder.compute();
		output = myEncoder.getOutput();
		JOptionPane.showMessageDialog(null,"Your reversed word with the vowels represented as numbers is " +output);

	}
}