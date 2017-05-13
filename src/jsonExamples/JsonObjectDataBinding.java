package jsonExamples;

import com.google.gson.Gson;

public class JsonObjectDataBinding {
	public static void main(String[] args){
		//Create a Gson instance 
		Gson gson =  new Gson();
		Student student = new Student();
		student.setAge("100");
		student.setName("Jk Rowling");
		//set values in student object
		System.out.println(student);
		//map Student object to JSON content 
		String jsonString = gson.toJson(student);
		System.out.println(jsonString);
		//map JSON content to Student object 
		Student student1 = gson.fromJson(jsonString, Student.class);
		System.out.println(student1);
		
		
		
	}

}
