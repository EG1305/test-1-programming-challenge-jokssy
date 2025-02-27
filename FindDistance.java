/*
 * Joshua Bazaldua, Exam 1: Find Distance class
 */
import java.util.Scanner; //import library to take user input

public class FindDistance {
	
	//Computes and returns distance
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
	}
	
	//Returns "Short", "Medium", or "long" based on the computed distance
	public static String classifyDistance(double distance) {
		if (distance < 5) {
			return "short";
		} else if (distance >= 5 && distance <= 15){
			return "Medium";
		} else {
			return "Long";
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //allows to take input from keyboard
		
		double x1, x2, y1, y2; //placeholders for coordinates
		
		System.out.println("The program will calculate the distance between two points"); //display program purpose
		System.out.println("Please enter the x and y values for the first point"); //prompts user for first coordinate
		
		System.out.println("x: ");
		x1 = input.nextDouble(); //stores value in x1
		
		System.out.println("y: ");
		y1 = input.nextDouble(); //stores value in y1
		
		System.out.println("Please enter the x and y values for the second point"); //prompt user for second coordinate
		
		System.out.println("x: ");
		x2 = input.nextDouble(); //stores value in x2
		
		System.out.println("y: ");
		y2 = input.nextDouble(); //stores value in y2
		
		double distance = getDistance(x1, y1, x2, y2); //calls method for distance value
		
		System.out.printf("The distance between these two points is %.2f\n", distance); //prints distance
		
		System.out.println("Classification: " + classifyDistance(distance)); //prints classification

		input.close(); //closes input
	}

}
