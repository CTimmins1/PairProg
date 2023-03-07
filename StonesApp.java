/*
*StonesAapp.java
*07.03.23
*C.Timmins
*/
import javax.swing.JOptionPane;

public class StonesApp{
	public static void main(String args[]){
		//variables
		String month, stone;
		//declare obj
		Stones myStones;
		//create objects
		myStones = new Stones();
		//input
		month = JOptionPane.showInputDialog(null,"Enter your month in three letters here ; ");
		myStones.setMonth(month);
		//compute
		myStones.computeStone();
		//output
		stone = myStones.getStone();
		JOptionPane.showMessageDialog(null,"The stone for your chosen month is ;"+stone);

	}
}