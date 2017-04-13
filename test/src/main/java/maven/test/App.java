package maven.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    }
    
    public static int readConsoleLine(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the result for 5 + 4.");
        System.out.println("Calculate how many days passed from start of the year.");
        int i = 0;

        try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			// TODO Auto-generated catch block
			System.err.print("Invalid format!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return i;
    }
}
