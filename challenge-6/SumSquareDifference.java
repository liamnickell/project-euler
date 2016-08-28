import java.util.*;

public class SumSquareDifference {

	public static int findSumSquareDifference(int numbers){
		int sumOfSquares = 0;
		int sum = 0;

		for(int i=1; i<=numbers; i++){
			sumOfSquares += i * i;
		}

		for(int i=1; i<=numbers; i++){
			sum += i;
		}

		if(sum * sum > sumOfSquares){
			return (sum * sum) - sumOfSquares;
		} else {
			return sumOfSquares - (sum * sum);
		}
	}

	public static void main(String args[]){
		System.out.println(findSumSquareDifference(100));
	}

}
