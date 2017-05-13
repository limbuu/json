package parsing;

public class ParseString {
	public static void main(String[] args){
		
		int integerValue =25;
		String parsedInteger = Integer.toString(integerValue);
		System.out.println("Parsed Integer Value:"+parsedInteger);
		String myName="helllo";
		myName.concat(parsedInteger);
		System.out.println(myName.concat(parsedInteger));
		
	}

}
