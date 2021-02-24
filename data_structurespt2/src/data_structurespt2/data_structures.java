package data_structurespt2;
import java.lang.Math;
public class data_structures {
	
	public static double[] toPower(int size, int power) {
		double returnArr[];
		returnArr= new double[size];
		for(int i=0;i<size;i++) {
			returnArr[i] = Math.pow(i, power);
		}
		return returnArr;
	}
	
	
	public static void main(String[] args) {
		double[ ] myArr = {1,5,6,5,4,1};
		double sum=0;
		for (int i = 1; i<myArr.length; i++){
			sum+=myArr[i];
		}
		
		double[ ] exampleArray = {1,5,6,5,4,1};
		double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }
        
        System.out.println("Question 1: "+sum);
        System.out.println("Question 2: "+index);
      double[] resultArr = toPower(4,2);
      System.out.println("Question 3:");
      for(int i=0;i<resultArr.length;i++) {
    	  System.out.println(resultArr[i]);
      }
 
	}
	
}
