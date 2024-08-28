package algorithm_data_structure;

public class MinimumValueArray {
	
	public static void main(String[] args) {
		MinimumValueArray demo = new MinimumValueArray();
		
		int[] array = {5,7,3,6,2,8,1,2};
		
		int result = demo.findMinValue(array);
		
		System.out.print("Minimum value found is: " + result);
	}
	
	// The code I wrote match the solution 
	public int findMinValue(int[] array) {
		
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Illegal Input");
		}
		
		int temp = array[0];
		System.out.print("Array: { ");
		
		for(int i = 1; i < array.length ; i++) {
			
			if(i != array.length-1) {
				System.out.print(array[i]+ ", ");
			}else {
				System.out.print(array[i]);
			}
			
			if(temp > array[i]) {
				temp = array[i];
			}
		}
		
		System.out.println(" }");
		return temp;
	}

	
	
}
