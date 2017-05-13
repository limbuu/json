package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Streams {
	public static void main(String[] args){
		//for each
		List<String> strings =  Arrays.asList("abc","xyz","123");
		strings.forEach(System.out::println);
	
		//map
		
		
		
		//filter
		
		List<Integer> integers = Arrays.asList(1,2,3,3,4,5,6,6);
		//integers.parallelStream().map(i->i*i).distinct().collect(supplier, accumulator, combiner);
		//limit used to limit size of stream
		Random randoms = new Random();
		randoms.ints().limit(10).forEach(System.out::println);
		//sorted used to sort the stream
        randoms.ints().limit(5).sorted().forEach(System.out::println); 
        //parallel processing
        
		
		//collectors
		
		//statistics
		
		
	}

}
