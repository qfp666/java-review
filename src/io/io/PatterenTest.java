package io.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterenTest
{
	private static final String match = "全福平666";
	private static final String fileName = "D:\\java-review\\src\\io\\io\\reader2.text";

	public static void main(String[] args)
	{
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));)
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				Pattern pattern = Pattern.compile(match);
				Matcher matcher = pattern.matcher(line);
				while(matcher.find()){
					System.out.println(matcher.group());
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
