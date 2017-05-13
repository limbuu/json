package jsonExamples;

import java.util.Arrays;

import com.google.gson.Gson;

public class JsonObjectDatabindingwithInnrClass {
	public static void main(String[] args){
		
		Gson gson = new Gson();
		StudentModified stdMod = new StudentModified();
		stdMod.setFirstName("Barak");
		stdMod.setLastName("Obama");
		stdMod.setRollNo(101);
		stdMod.setAddress("Kathmandu");
		int[] marks = {100,200};
		stdMod.setMarks(marks);
		
		String jsonString = gson.toJson(stdMod);
		System.out.println(jsonString);
		System.out.println("");
		
		StudentModified student = gson.fromJson(jsonString, StudentModified.class);
		System.out.println(student);
		
		
	}

}
