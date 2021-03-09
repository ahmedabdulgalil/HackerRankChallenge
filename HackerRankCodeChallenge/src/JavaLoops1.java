
import java.util.*;
public class JavaLoops1 {
	
	// Task: Given an integer N, print its first 10 multiples. Each N X i
	// (where 1 <= i <= 10) should be printed on a new line in the form:
	// N X i = result.
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		
		for(int i=1; i<=10; i++) {
			if(N >= 2 && N <= 20) {
				int sum = N * i;
				System.out.printf("%d x %d = %d%n", N, i, sum);
			}
		}
	}
	

}
