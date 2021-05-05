import java.util.*;
import java.io.*;

public class ProcessingSales {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("SalesDate.txt");
		Scanner input=new Scanner(file);
		ArrayList semester=new ArrayList<Date>();
		ArrayList earnings=new ArrayList<Double>();
		
		while(input.hasNext()) {
			String line=input.nextLine();
			String[] tokens=line.split(" ");
			System.out.println(line);
			for(String s:tokens)
				System.out.println(s);
			semester.add(new Date(tokens[0]));
			
			double earning=0;
			for(int i=1; i<tokens.length;i++)
				earning+=Double.parseDouble(tokens[i]);
			earnings.add(earning);
			
		}
		System.out.println(semester);
		System.out.println(earnings);
		
		input.close();

	}

}
