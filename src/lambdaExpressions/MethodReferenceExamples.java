package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExamples {
	public static void main(String[] args){
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("wello");
		list.add("pello");
		
		list.forEach(System.out::println);
		
		List<String> listString = Arrays.asList("a","b","c","aa");
		listString.forEach(System.out::println);
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,4,10);
		System.out.println(integerList.indexOf(2));
		integerList.forEach(System.out::println);
		
		
		
		
	
		
	}

}
