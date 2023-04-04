/*
*GuessingGame.java
*C.Timmins & Oisin McC
*4/4/23
*/

public class GuessingGame{
	private String secret;
	private String guess;
	private String output;
	private

	public GuessingGame(){
		secret = " ";
		guess = " ";
		output = " ";

	}
	public void setSecret(String secret){
		this.secret = secret;
	}
	public void setGuess(String guess){
		this.guess = guess;
	}
	//comput method
	public void compute(){
		for(int i = secret.length()+1 ; i++){

