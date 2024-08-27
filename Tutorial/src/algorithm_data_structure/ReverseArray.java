package algorithm_data_structure;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		ReverseArray demo = new ReverseArray();
		
		int[] array = {2, 11, 5, 10, 7, 8};
		demo.printArray(array, "Original Array");
		
		int[] result = demo.reverseArray(array);
		demo.printArray(result, "Reversed Array");
		
	}
	
	public int[] reverseArray(int[] array) {
		
		int[] reversedArray = new int[array.length];
		int reversedCount = array.length-1;		
		
		for(int i = 0; i < array.length; i++) {
			reversedArray[i] = array[reversedCount];
			reversedCount--;
		}
		
		return reversedArray;
	}
	
	public void printArray(int[] array, String arrayType) {
		System.out.print(arrayType + ": {");
		
		for(int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("}");
	}
}
