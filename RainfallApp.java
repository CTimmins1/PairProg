/*
*RainfallApp.java
*C.Timmins & O. McC
*Develop an app using instaiantiable and arrays that accepts values of rainfall from user for 7 days per week for 4 weeks. Calculate and display average rainfall for each of the for weeks
*/
import javax.swing.JOptionPane;

public class RainfallApp {
    public static void main(String[] args) {
        // variables
        int[][] arr = new int[4][7];
        int avg, sum = 0;

        // object
        Rainfall myRainfall = new Rainfall();

        // input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter rainfall:"));
            }
            myRainfall.setRainfall(arr);
              // computation
			        myRainfall.compute();
			        avg = myRainfall.getRainfall();

			        // output
        JOptionPane.showMessageDialog(null, "Average rainfall: " + avg);
        }


    }
}



