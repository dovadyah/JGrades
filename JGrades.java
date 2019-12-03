/*			!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *								REVISE!
 *			!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *
 *@Daniel Delgado
 *Obadiah Group LLC
 */

//APIs
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.*;

//This program was made by Daniel Delgado. It takes an input from a user on their grades; stores it in an array and calculates the average

//Main Class
public class JGrades{
	
	//Main Function
	public static void main(String[] args) {
		
		//Decimal Format
		DecimalFormat floatingPoint_2 = new DecimalFormat("#.###");
		
		/***************************************
		*************Variables******************
		****************************************/
		double[] studentGrades; 
		double gradeSummation = 0, averageGrade;
		int amountOfGradesInClass, inputLoop = 0;
		String inputString;
	
		//User Input
		JOptionPane.showMessageDialog(null, "Welcome!" );
	
		//User Input of Amount of grades given in class
		inputString = JOptionPane.showInputDialog("Let's calculate your grade!\nPlease enter the amount of grades that are calculated in your final grade: ");
		amountOfGradesInClass = Integer.parseInt(inputString);
		
		//Define Array
		studentGrades = new double[amountOfGradesInClass];
		
		JOptionPane.showMessageDialog(null, "Great!");
	
		//for(int i = 0, j = amountOfGradesInClass; i < j; i++)	//Other Method - User Input 
		while(inputLoop < amountOfGradesInClass){
			inputString = JOptionPane.showInputDialog("Please input your grades for this semester: ");
			studentGrades[inputLoop] = Double.parseDouble(inputString);
			inputLoop++;
		}
	
		//Algorithm
		for(int a= 0, b = amountOfGradesInClass; a < b; ++a){
			gradeSummation += studentGrades[a];
		}
		averageGrade = gradeSummation/amountOfGradesInClass;
		
	//Letter Grades
		if(averageGrade>100) {																			//Letter Grade Beyond A 
			printOutLoop(amountOfGradesInClass, studentGrades);
			System.out.println("comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("Congratulations you got more than A! You must be very proud!");
			System.out.println("You can go onto the next course!");
		} else if(averageGrade>=90) {																	//Letter Grade A					
			printOutLoop(amountOfGradesInClass, studentGrades);
			System.out.println("comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("Congratulations you got an A!");
			System.out.println("You can go onto the next course!");
		} else if(averageGrade>=80) {																	//Letter Grade B
			printOutLoop(amountOfGradesInClass, studentGrades);
			System.out.println("comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("Congratulations you got a B!");
			System.out.println("You can go onto the next course!");
		} else if(averageGrade>=70) {																	//Letter Grade C
			printOutLoop(amountOfGradesInClass, studentGrades);
			System.out.println("comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("You got a C, might want to work on this grade.");
			System.out.println("You can go onto the next course!");
		} else if(averageGrade>=60) {																	//Letter Grade D
			printOutLoop(amountOfGradesInClass, studentGrades);
			System.out.println("comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("You got a D. You barely Passed");
			System.out.println("You can go onto the next course!");
		}else {																							//Letter Grade F
			printOutLoop(amountOfGradesInClass, studentGrades);
			JOptionPane.showMessageDialog(null, "comming to an average of " + floatingPoint_2.format(averageGrade));
			System.out.println("Congratulations you FAILED!");
			System.out.println("See you in my class next semester!");
		} 	
	
		//Exit
		System.exit(0);
		
	}



	//GRADE PRINT OUT LOOP
	public  static void printOutLoop(int gradeNum, double[] grades){
		JOptionPane.showMessageDialog(null, "Your calculated grades are ");
			for(int v = 0, f = gradeNum; v < f; ++v){
				if(v == (gradeNum-1)){
				 	JOptionPane.showMessageDialog(null, "and " + grades[v] + "; ");
				} else{
					JOptionPane.showMessageDialog(null, grades[v] + ", ");
				}
			}
	}
}