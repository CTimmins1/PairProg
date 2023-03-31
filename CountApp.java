/*
*CountApp.java
*C.Timmins
*27/03
*develop an app to accept string and output amount of vowels in that string
*/

import javax.swing.JOptionPane;

public class CountApp{
	public static void main(String args[]){
		String input;
		int v;

		Count myV = new Count();

		input = JOptionPane.showInputDialog(null,"Enter a word");
		myV.setInput(input);

		myV.compute();

		v= myV.getV();
		JOptionPane.showMessageDialog(null,"There are "+v+" Vowels in "+input);
	}
}