package parsing;
/**
 * convert string to integer
 * @author manshi
 *
 */
public class ParseInteger {
	public static void main(String[] args){
     
		String numberValue = "100";
		System.out.println(numberValue);
		System.out.println(numberValue+100);//outputs 100100 coz 100 is string here and + concates both
		
		int intValue = Integer.parseInt(numberValue);
		System.out.println(intValue);
		System.out.println(intValue+100);//outputs 200 coz 100 in intValue is int here abd + adds both 
		
		//alternatively one can use Integer.valueOf() which returns integer object here
		
	      int intValue1 = Integer.valueOf(numberValue);
	      System.out.println(intValue1);
	      String numValue1 = "200.22";
	      Double intValue2 = Double.parseDouble(numValue1);
	      System.out.println(intValue2);
		
	}

}
