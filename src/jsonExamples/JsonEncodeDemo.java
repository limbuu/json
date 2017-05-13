package jsonExamples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonEncodeDemo {
	
	public static void main(String[] args) {
   
		String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
		//create json Object,reusable object
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting(); //for following builderpattern
		Gson gson = gsonBuilder.create(); //Constructs a Gson object with default configuration.
		
		//insert json values and object clss as parameter 
		Student student = gson.fromJson(jsonString, Student.class);
		System.out.println(student);
		
		//object to json conversion
		jsonString = gson.toJson(student); 
	     System.out.println(jsonString);  
		
		
		
		
    
    }

}
