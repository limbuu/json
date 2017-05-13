package lambdaExpressions;
/**
 * parameter -> expression body
 * @author manshi
 *
 */
public class LambdaExpression {
	public static  void main(String[] args){
		
		 LambdaExpression lambda = new LambdaExpression();
		 MathOperation addition = (int a, int b) -> a + b; //this is lambda expression
		 System.out.println("Addition: "+lambda.operate(5, 10, addition));
		 
		 MathOperation subtraction = (int a, int b) -> a-b;
		 System.out.println("Subtraction: "+ lambda.operate(10, 5, subtraction));
		 
		 MathOperation multiplication = (int a, int b) -> a*b;
		 System.out.println("Multiplication:"+lambda.operate(10,5, multiplication));
		 
		 MathOperation divison = (int a, int b)-> a/b;
		 System.out.println("Division: "+lambda.operate(10,5, divison));
		 
		 }
	
	public interface MathOperation {
	    int operation(int a, int b);
		}
  
	private int operate(int a, int b, MathOperation mathOperation){
	
	   return mathOperation.operation(a, b);
	   
   }

}
