package mianshi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class mianTest3
{
	public static void main(String[] args)
	{
		System.out.println(formatTime(61));
	}

	private static String  formatTime(long  seconds)
	{    //年->天->时->分->秒
          long years = seconds/(365*24*60*60);
		  //363天->一年+1天
		  long days =  seconds%(365*24*60*60)/(24*60*60);
		  long hours = ((seconds%(365*24*60*60))%(24*60*60))/(60*60);
		  long minutes =((seconds%(365*24*60*60))%(24*60*60))%(60*60)/60;
		  long newSeconds = seconds%60;
		StringBuilder sb = new StringBuilder();
		if(years>0){
			sb.append(years+" ").append("years ").append("and ");
		}
		if(days>0){
			sb.append(days+" ").append("days ").append("and ");
		}
		if (hours>0){
			sb.append(hours+" ").append("hours ").append("and ");
		}
		if(minutes>0){
			sb.append(minutes+" ").append("minutes ").append("and ");
		}
		if(newSeconds>0){
			sb.append(newSeconds+" ").append("seconds");
		}
		return sb.toString();

	}

}
