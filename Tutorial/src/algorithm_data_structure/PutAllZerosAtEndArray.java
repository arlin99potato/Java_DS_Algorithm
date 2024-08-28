package algorithm_data_structure;

public class PutAllZerosAtEndArray {

	public static void main(String[] args) {
		
		PutAllZerosAtEndArray demo = new PutAllZerosAtEndArray();
		Printer printer = new Printer();
		
		int[] array = {0,1,0,4,12};
		
		printer.printArray(array, "Original");
		
//		int[] result = demo.putZerosEnd(array);
		
		int[] result = demo.putZerosEnd(array, array.length);
		
		printer.printArray(result, "Result");
		
	}
	
//	// My own code without checking: Result are correct
//	public int[] putZerosEnd(int[] array) {
//		
//		int nearestIdx = 0;
//		
//		for(int i = 0; i < array.length - 1 ; i++) {
//			
//			if(array[i] == 0 && array[i+1] != 0) {
//				array[nearestIdx] = array[i+1];
//				array[i+1] =0;
//				nearestIdx++ ;				
//	        }
//			
//		}
//		
//		return array;
//	}
	
	// Answer given by instructor
	public int[] putZerosEnd(int[] array, int length) {
		int j = 0;
		
		for(int i = 0; i< length; i++) {
			if (array[i] != 0 && array[j] == 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
			if(array[j]!= 0) {
				j++;
			}
		}
		return array;
	}
}
