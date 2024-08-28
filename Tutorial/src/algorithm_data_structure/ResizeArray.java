package algorithm_data_structure;

public class ResizeArray {

	
	public static void main(String[] args) {
		ResizeArray demo = new ResizeArray();
		Printer printer = new Printer();
		
		int[] array = {2,3,4,6,4};
		printer.printArray(array, "Original Array");
		
		array = demo.resizeArray(array, 8);	
		printer.printArray(array, "New Array");
		
	}
	
	public int[] resizeArray(int[] array, int capacity) {
		
		int[] temp = new int[capacity];
		
		for(int i = 0; i < array.length ; i++) {
			temp[i] = array[i];
		}
		
		return temp;
	}
}
