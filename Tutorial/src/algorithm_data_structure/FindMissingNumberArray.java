package algorithm_data_structure;

public class FindMissingNumberArray {

	
	public static void main(String[] args) {
		FindMissingNumberArray demo = new FindMissingNumberArray();
		Printer printer = new Printer();
		
		int[] array = {2,4,1,8,6,3,7};
		printer.printArray(array, "Given Arrray:");
		
		//int missingNumber = demo.findMissingNumber(array, 8);
		
		int missingNumber = demo.findMissingNumber(array);
		System.out.print("The missing number from list is: " + missingNumber);
	}
	
	// My code
//	public int findMissingNumber(int[] array, int length) {
//		
//		int total = length * (length+1)/2;
//		int actualTotal = 0;
//		
//		for(int i = 0; i < array.length ; i++) {
//			actualTotal += array[i];
//		}
//		return total - actualTotal;
//	}
	
	public int findMissingNumber(int[] array) {
		int n = array.length + 1;
		int sum = n * (n + 1) / 2;
		
		for(int num: array) {
			sum = sum - num;
		}
		
		return sum;
	}
}
