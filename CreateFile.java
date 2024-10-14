import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		try
		{
			File myobj=new File("Sample2.txt");
		if(myobj.createNewFile())
		{
			System.out.println("File Created:"+myobj.getName());
		}
		else
		{
			System.out.println("File Already Exist");
		
		}
		}
		catch(IOException e)
		{
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}

}
