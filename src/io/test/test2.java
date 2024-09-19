package io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * jdk 7 try with resource优化
 */
public class test2
{
	public static void main(String[] args)
	{

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\java-review\\src\\1.text"))){
			String line;
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}

		}catch (IOException io){
			System.out.println(io.getMessage());
		}
	}
}
