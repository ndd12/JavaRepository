package CreditCardFraud;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String file_name = "C:/Users/nd122222/Desktop/test.txt";
	
			try{
				ReadFile file = new ReadFile(file_name);
				String[] aryLines = file.OpenFile();
				
				int i;
				for ( i=0; i < aryLines.length; i++ ) {
				System.out.println( aryLines[ i ] ); 
				}
				String word = aryLines[0];
				String check = "|";
				int index1 = word.indexOf(check);
				System.out.println(index1);
			    int index2 = word.substring(index1,check).indexOf(check);
			    int index2Location = word.
			    String deposit = aryLines[0].substring(index1,index2);
			    int depositNumber = Integer.parseInt(deposit);
			    System.out.println(depositNumber);
				
				
				
			}
			catch (IOException e){
				System.out.println(e.getMessage());
			}
			
	}

	private static int readLines() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

