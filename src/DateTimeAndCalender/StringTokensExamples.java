package DateTimeAndCalender;

import java.util.StringTokenizer;

public class StringTokensExamples {
	public static void main(String[] args){
		StringTokenizer stringTokens = new StringTokenizer("Hello everyone, warm welcome to fusemachines.com");
		System.out.println("Tokens:"+stringTokens.countTokens());
//		while(stringTokens.hasMoreElements()){
//		System.out.println(stringTokens.nextElement());
//			
//		}
//		System.out.println("Tokens");
		//both are same
		
		while(stringTokens.hasMoreTokens())
		{
		 System.out.println(stringTokens.nextToken());
		}
		
		
		
	}

}
