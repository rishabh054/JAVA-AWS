package lab1;

public class Exercise6 {
	   public static int calculateDifference (int n){
	      //sum of squares of n natural numbers
	      int sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;
	      //sum of n natural numbers
	      int sum = (n * (n + 1)) / 2;
	      //square of sum of n natural numbers
	      int squareSum = sum * sum;
	      //difference
	      return Math.abs(sumSquare - squareSum);
	   }
	   public static void main(String args[]){
	      int n = 3;
	      System.out.println("Difference: " + calculateDifference (n));
	   }
	}

