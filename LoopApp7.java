/*
*LoopApp7.java
*@author O.McGillicuddy
*14/3/23
*/

import java.util.Scanner;

public class LoopApp7{
	public static void main (String args[]){
        int sum =0;

		//create objects
		Scanner myNum = new Scanner(System.in);

		//input
		System.out.println("please enter a number");
		int num = myNum.nextInt();

        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of the numbers are " + sum);
    }
}