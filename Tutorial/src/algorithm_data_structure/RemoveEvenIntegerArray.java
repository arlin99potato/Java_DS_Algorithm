package algorithm_data_structure;

public class RemoveEvenIntegerArray {
	
	public static void main(String[] args) {
		// Create instance due to reside inside static method
		RemoveEvenIntegerArray object = new RemoveEvenIntegerArray();
		
		int[] array = {3,2,4,7,10,6,5};
		object.removeEvenInteger(array);
	}
	
	public void removeEvenInteger(int[] array) {
		int count = 0;
		
		System.out.print("Array: { ");
		
		// Count the number of even integers
		// To create new array
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
			// If element is not divisible by 0
			if(array[i] % 2 != 0) {
				count++;
			}
		}
		
		System.out.println("}");
		
		// Create new array with default value
		int[] newArray = new int[count];
		int newCount = 0;
		
		System.out.print("New Array: { ");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				newArray[newCount] = array[i];
				System.out.print(newArray[newCount] + " ");
				newCount++;
			}
		}
		
		System.out.print("}");
	}

}
