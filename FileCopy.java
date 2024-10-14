import java.io.*;
public class FileCopy 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("Filename1.txt");
			FileOutputStream fout=new FileOutputStream("Filename2.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
		fin.close();
		fout.close();
		System.out.println("Copied Content Of The File");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file Not Found"+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IO Error:" +e.getMessage());
		}
		
	}

}