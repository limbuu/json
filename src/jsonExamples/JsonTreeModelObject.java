package jsonExamples;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonTreeModelObject {
	public static void main(String[] args){
		Student student = new Student();
		student.setName("Ramesh");
		student.setAge("100");
		
		Student student1 = new Student();
		student1.setName("Dinesh");
		student1.setAge("200");
		Gson gson = new Gson();
		//what to do in this case???
		String jsonString = gson.toJson(student);
		System.out.println(jsonString);
		
		
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonTree = jsonParser.parse(jsonString);
		
		JsonObject details = jsonTree.getAsJsonObject();
		
		JsonElement treeName = details.get("name");
		System.out.println(treeName);
		JsonElement treeAge = details.get("age");
		System.out.println(treeAge);
		
		
	}
	
	
	}

