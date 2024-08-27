package algorithm_data_structure;

public class ArrayUtil {
	
	public static void main(String[] args) {
		ArrayUtil arrUtil = new ArrayUtil();
		
		arrUtil.arrayDemo();
	}
	
	public void printArray(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public void arrayDemo() {
		int[] myArray = new int[5];  // default values
		
		myArray[0] = 5;
		myArray[1] = 1;
		myArray[2] = 8;
		myArray[3] = 2;
		myArray[4] = 10;
		myArray[2] = 9;	// Update
		
		printArray(myArray);
		
		System.out.println(myArray.length);
		System.out.println(myArray[myArray.length-1]);
		
		// new array
		int[] arr = {5,1,8,10};
		int[] arr2 = {3,4};
		printArray(arr);
		
		printArray(new int[] {2,7,5});
	}

}
