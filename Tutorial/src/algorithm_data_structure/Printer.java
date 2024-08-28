package algorithm_data_structure;

public class Printer {
	
public void printArray(int[] array, String arrayType) {
		
		System.out.print( arrayType + ": {");
		
		for(int i = 0; i< array.length ; i++) {
			if (i != array.length-1) {
				
				System.out.print(array[i] + ", ");
				
			}else {
				System.out.println(array[i] + "}");
			}
		}
	}

}
