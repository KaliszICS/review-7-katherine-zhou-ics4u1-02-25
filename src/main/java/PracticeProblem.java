import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Write your functions here
	public static String EvenOrOdd(int even){
		if (even % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}

	public static String teacherOrStudent(String word){
		if (word == "Kalisz"){
			return "Teacher";
		}
		else{
			return "Student";
		}
	}

	public static int fartherFromZero(int num){
		if (num>0){
			int num1 = num+5;
			return num1;
		}

		else if (num< 0){
			int num2 = num - 5;
			return num2;
		}

		else {
			return num;
		}

	}

	public static String isFive(int five){
		if (five == 5){
			return "The number is Five";
		}

		else {
			return "The number is not Five";
			}

			
		}
		
	public static String positiveOrNegative(double neg){
		if (neg > 0){
			return "Positve";
		}
	
		else {
			return "Negative";
			}
		}

	public static String highOrLow(int big){
		if (big > 100){
			return "High";
		}
		
		else {
			return "Low";
		}
	}

	public static String isHello(String hi){
		if (hi == "Hello"){
			return "The word is Hello";
		}
		else {
			return "The word is not Hello";
		}
	}


}
