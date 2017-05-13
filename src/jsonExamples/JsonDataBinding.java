package jsonExamples;

import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDataBinding {
	public static void main(String[] args){
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		String name = "ABC";
		String address = "Dharan";
		long rollNo = 1;
	    boolean verified = false; 
	    int[] marks = {100,90,85};  
	      
		
		//serialization (from object to json file format)
       System.out.println("{"+gson.toJson(name)+""+ gson.toJson(address)+""+gson.toJson(rollNo)+""+gson.toJson(verified)+""+gson.toJson(marks)+"}");
       
       //deserialization (from json file to object format)
       name = gson.fromJson("\"ABC\"", String.class); 
       address = gson.fromJson("\"Dharan\"", String.class);
       rollNo = gson.fromJson("1", Long.class);
       verified = gson.fromJson("false", Boolean.class);
       marks = gson.fromJson("[100,90,85]", int[].class);  
       
       System.out.println(""+name+""+address+""+rollNo+""+verified+""+Arrays.toString(marks));
       
       
		
		
		
	}

}
