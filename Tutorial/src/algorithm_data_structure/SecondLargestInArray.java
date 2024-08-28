package algorithm_data_structure;

public class SecondLargestInArray extends Printer {

	public static void main(String[] args) {
		SecondLargestInArray demo = new SecondLargestInArray();
		Printer printer = new Printer();
		
		int [] array = {2,5,3,7,3,6,1,3,6,10,8,9,11};
		
		printer.printArray(array);
		
		int result = demo.findSecMaxValue(array);
		
		System.out.print("The second largest number in array is " + result);
		
	}
	
	public int findSecMaxValue (int[] array) {
		
		int max = array[0];
		int secondMax = 0;
		
		for(int i = 1; i < array.length; i++) {
			
			if (max < array[i]) {
				secondMax = max;
				max = array[i];
			} 
			
			else if (max != array[i] && secondMax < array[i]) {
					secondMax = array[i];
			}
		}
		
		return secondMax;
		
	}
	

}
