/*
*Stones.java
*author @C.timmins
*07/03/23
*/
public class Stones{
	//data members variables
	private String month;
	private String stone;

	//constructor
	public Stones(){
		month = null;
		stone = null;
	}
	//setters
	public void setMonth(String month){
		this.month = month;
	}
	public void setStone(String stone){
		this.stone = stone;
	}
	//compute methods
	public void computeStone(){
		switch(month){
			case "jan":
			stone = "garnet";
			break;
			case "feb":
			stone = "amethyst";
			break;
			case "mar":
			stone = "aquamarine";
			break;
			case "apr":
			stone = "diamond";
			break;
			case "may":
			stone = "emerald";
			break;
			case "jun":
			stone = "pearl";
			break;
			case "jul":
			stone = "ruby";
			break;
			case "aug":
			stone = "peridot";
			break;
			case "sep":
			stone = "sapphire";
			break;
			case "oct":
			stone = "opal";
			break;
			case "nov":
			stone = "topaz";
			break;
			case "dec":
			stone = "turquoise";
			break;
		}
	}
	//getters
	public String getStone(){
		return stone;
	}
}
