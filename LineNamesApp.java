/*
*LineNamesApp.java
*C.Timmins & O.McC
*28/03/23
*/

import javax.swing.JOptionPane;

public class LineNamesApp{
	public static void main (String args[]){
		//inputs
		String word;

		word = JOptionPane.showInputDialog(null,"Enter a word here; ");
			for(int i = 0; i<= word.length()-1;i ++){
				System.out.println(word.charAt(i));



		}
	}
}

