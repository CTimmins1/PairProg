/*
*Rainfall.java
*C.Timmins & O. McC
*Develop an app using instaiantiable and arrays that accepts values of rainfall from user for 7 days per week for 4 weeks. Calculate and display average rainfall for each of the for weeks
*/
public class Rainfall{
	private int[][] arr;
	private int avg;
	private int sum;
	private int value;
//constructors
public Rainfall(){
	arr = new int [4][7];
	avg = 0;
	sum = 0;
}
//setters
public void setRainfall(int[][] value){
	arr = value;
}
//compute method
public void compute(){
	for(int i = 0; i < arr.length; i ++){
		for(int j = 0; j < arr[i].length; j ++){
			sum += arr[i][j];
		}
	}
 avg = sum/7;
}
//getters
public int getRainfall(){
	return avg;
			}
		}

