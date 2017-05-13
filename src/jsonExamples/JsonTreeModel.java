package jsonExamples;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/**
 * 
 * 
 * tree-model prepares in-memory tree representation of the JSON document
 * builds tree of JSON object nodes
 * JsonParser provide rootNode of the tree after reading JSON
 * RootNode can be used to parse the enitre tree
 * @param args
 */

public class JsonTreeModel {
	
	public static void main(String[] args){
		// json
		String jsonString ="{\"name\":\"Mahesh Kumar\", \"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
       // Create an Json Parser Instance
		JsonParser parser = new JsonParser();
		//create tree for json
		
		JsonElement rootNode = parser.parse(jsonString);
		
		
		//now traversing tree
		
		if(rootNode.isJsonObject()){
		//Object type in json 
		JsonObject details = rootNode.getAsJsonObject();
		JsonElement nameNode = details.get("name");
		System.out.println("Name:"+nameNode);
		
		JsonElement ageNode = details.get("age");
		System.out.println("Age:"+ageNode);
		
		JsonElement verifiedNode = details.get("verified");
		System.out.println("Verified:"+verifiedNode);
		
		JsonElement marksNode = details.get("marks");
		System.out.println("Marks:"+marksNode);
		}
		
		
		
		
		
		
		
	}

}
