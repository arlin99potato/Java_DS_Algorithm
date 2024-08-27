
public class TimeComplexityDemo {
	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		
		TimeComplexityDemo demo = new TimeComplexityDemo();
		
		System.out.println("The total of first 99999 numbers is ");
		System.out.println(demo.findSum(99999));
		
		System.out.println("The time taken to procees it is " + (System.currentTimeMillis() - now) + " millisecs.");
	}
	
	// This method produce in much less time than the later
//	public int findSum(int n) {
//		return n*(n+1)/2;
//	}
//	
	public int findSum(int n) {
		int sum = 0;
		
		for(int i =0; i<=n ; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
