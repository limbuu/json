package jsonExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonObjectSerialization {
	
	//serialize java object to json file and then read the json file to get back the java object
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		JsonObjectSerialization json = new JsonObjectSerialization();
		
		Student student = new Student();
		student.setName("Richard Benjamin");
		student.setAge("100");
	    System.out.println(student);
	    json.writeJson(student);
	    Student student1 = json.readJson();
	    System.out.println(student1);
	   
		
	}
		public static void writeJson(Student student) throws IOException{
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			FileWriter writer = new FileWriter("student.json");
			writer.write(gson.toJson(student));
			writer.close();
			}
		public static Student readJson() throws FileNotFoundException{
		    GsonBuilder builder = new GsonBuilder();
		    Gson gson = builder.create();
		    BufferedReader reader = new BufferedReader( new FileReader("student.json"));
		    Student student =gson.fromJson(reader, Student.class);
		    return student;
			
		}
		
	}
	
	


