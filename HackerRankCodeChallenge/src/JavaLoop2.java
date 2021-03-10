
import java.util.*;
import java.io.*;

public class JavaLoop2 {
	
	// we use the integers a, b, and n to create the following series
	// ( a+ 2^0 x b), (a + 2^0  x b + 2^1 x b), ...., (a + 2^0 x b + 2^1 x b+.....+2^n-1 x b)
	// you are given q queries in the form of a, b and n. For each query, print the series 
	// corresponding to the given a, b, and n values as a single line of n space-separated integer
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int k=0; k< n; k++) {
            	int query = a + (int) Math.pow(2, k) * b;
            	for(int j=0; j< k; j++) {
            		query += Math.pow(2, j) * b;
            	}
            	System.out.printf("%d ", query);
            
            }
            System.out.println();
        }
        in.close();
        
        
       
    }

}
