import java.util.*;
import java.io.*;
public class FileReaderAndWriter
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			File obj1 = new File("Register1.txt");
			obj1.createNewFile();
			System.out.println("Register.txt created\n");
			FileWriter fout = new FileWriter("Register.txt");
			System.out.print("Enter keam rank Number: ");
			int n = sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("Data added");
			FileReader fin = new FileReader("Register.txt");
			BufferedReader br = new BufferedReader(fin);
			String line;
			System.out.println("\nContent of Register.txt is:");
			sc.close();
			while ((line = br.readLine()) != null) 
			{
				System.out.println(line);
			}
			br.close();
		}
		catch (IOException e)
		{
			System.out.println("Exception occured: " +e.getMessage());
		}
	}
}