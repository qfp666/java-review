package serializable;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class SerializableDemo
{
	public static void main(String[] args) throws IOException
	{
		//Initializes The Object
		User user = new User();
		user.setName("hollis");
		user.setGender("male");
		user.setAge(23);
		user.setBirthday(new Date());
		System.out.println(user);

		//Write Obj to File
		ObjectOutputStream oos = null;
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(user);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			oos.close();
		}

		//Read Obj from File
		File file = new File("tempFile");
		ObjectInputStream ois = null;
		try
		{
			ois = new ObjectInputStream(new FileInputStream(file));
			User newUser = (User) ois.readObject();
			System.out.println(newUser);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
		}
	}
}
