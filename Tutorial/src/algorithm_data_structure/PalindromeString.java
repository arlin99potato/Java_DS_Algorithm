package algorithm_data_structure;

public class PalindromeString extends Printer {
	

	public static void main(String[] args) {
		
		PalindromeString demo = new PalindromeString();
		String word = "tacocat";
		String word2 = "madam";
		String word3 = "that";
		
		demo.checkPalindrome(word);
		
		}
	
	public void checkPalindrome(String word) {
		boolean result = true;
//	 	My coding
//		int j = word.length()-1;
//		
//		for(int i = 0; i < word.length() ; i++) {
//			if(word.charAt(i)== word.charAt(j)) {
//				j--;
//			}else {
//				result = false;
//				break;
//			}	
//		}
		
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				result= false;
				break;
			}
			start++;
			end--;
		}
		
		System.out.print("The \" " + word + " \" is a palindrome: " + result);
	
	}
}
	
	
	

