/* blood.java
* 7/3/23
* Conor And ois
*/

public class Blood{
	private int age;
	private String blood;
	private String donateTo;
	private String getFrom;

	//constr
public Blood(){
	age = 0;
	blood = null;
}

	//setters
	public void setAge(int age){
		this.age = age;
	}
	public void setBlood(String blood){
		this.blood = blood;
	}

	//computes
	public void computeBlood(){
		if(age>= 18 && blood.equals("AB")){
			donateTo = "AB";
			getFrom = "AB, A, B, O";
		}
		else if( age>= 18 && blood.equals("A")){
			donateTo = "A, AB";
			getFrom = "A, O";
		}
		else if( age>= 18 && blood.equals("B")){
			donateTo = "B, AB";
			getFrom = "B, O";
		}
		else if( age>= 18 && blood.equals("O")){
			donateTo = "AB, A, B, O";
			getFrom = "O";
		}
		else{
			donateTo = "Invalid input";
			getFrom = "You can only donate if you are 18+";
		}
	}
	//getters
	public String getBlood(){
		return donateTo;
	}
	public String getGetFrom(){
		return getFrom;
	}
}