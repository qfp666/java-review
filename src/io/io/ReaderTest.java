package io.io;

import java.io.*;
import java.util.HashMap;
import java.util.regex.Pattern;

public class ReaderTest
{
	private static final String  readerFileName = "D:\\java-review\\src\\io\\io\\reader.txt";
	private static final String writerFileName  = "D:\\java-review\\src\\io\\io\\writer.txt";
	private static HashMap<String,String> hashMap = new HashMap<>();
	public static void main(String[] args)
	{

		/**
		 * 字符流
		 * FileReader继承InputStreamReader 继承Reader(”抽象类“)
		 * 缓冲流用BufferReader()里面传FileReader和InputStreamReader都行
		 */

		try(BufferedReader br = new BufferedReader(new FileReader(readerFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(writerFileName,true));){
			String line;
			while((line=br.readLine())!=null){
				String[] split = line.split(Pattern.quote("."));
				hashMap.put(split[0],split[1]);
			}
			for(int i=1;i<=hashMap.size();i++){
				String key = String.valueOf(i);
				String value = hashMap.get(key);
				bw.write(key+"."+value);
				bw.newLine();
			}
		}catch (IOException e){
			e.printStackTrace();
		}


	}
}
