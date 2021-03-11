import java.util.Scanner;

public class JavaEndOfFile {
	// the challenge her is to read n line of input until you reach EOF
	// then number and print all n lines of content
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int counter = 0;
		while(scanner.hasNext()) {
			counter++;
			String name = scanner.nextLine();
			
			
			System.out.println(counter +" "+ name);
			
		}
		
	}

}
