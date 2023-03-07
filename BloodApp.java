/* bloodApp.java
* 7/3/23
* Conor And ois
*/
import javax.swing.JOptionPane;


public class BloodApp{
	public static void main (String args[]){
		//variables
		int age;
		String donateTo, getFrom, blood;

	//dec objects
	Blood myBlood;
	//create obj
	myBlood = new Blood();

	//input
	blood = JOptionPane.showInputDialog(null, "Enter your blood type here; ");
	myBlood.setBlood(blood);

	age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age here; "));
	myBlood.setAge(age);

	//compute
	myBlood.computeBlood();

	//output
	donateTo = myBlood.getBlood();
	getFrom = myBlood.getGetFrom();
	JOptionPane.showMessageDialog(null,"You can donate to; "+donateTo+" & you can recieve from; "+getFrom);
}
}