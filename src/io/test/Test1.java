package io.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1
{
	public static void main(String[] args)
	{
		BufferedReader bufferedReader = null;

		try {
			String line;
			bufferedReader = new BufferedReader(new FileReader("D:\\java-review\\src\\1.text"));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bufferedReader != null){
					bufferedReader.close();
				}
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
