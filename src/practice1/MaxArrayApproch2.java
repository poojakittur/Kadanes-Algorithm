package practice1;

public class MaxArrayApproch2 {

public int[] inputArray = {31, -41, 59, 26, -53, 58, 97,-93,-23,84};
	
	public int maxSum = 0;
	
	public int maxSumMethod(int index, int maxHere, int maxSum) {
		System.out.println(index + " : " + maxHere + " : "+ maxSum);	
		if(index  <  0) {
			return maxSum;
		}
				
		maxHere = Math.max(0, maxHere + inputArray[index]);
		maxSum = Math.max(maxSum, maxHere);
		
		System.out.println("After Recursion : " + maxHere + " : "+ maxSum);
		return maxSumMethod(index - 1, maxHere, maxSum);
		//return maxSum;
	}
}
