// public class GenericsA{
	
	// public static <T extends Number> T add(T x, T y){
		// if(x instanceof Integer){
			// Integer s;
			// s = x.intValue() + y.intValue();
			// return (T)s;
		// }
		// else if(x instanceof Double){
			// Double s;
			// s = x.doubleValue() + y.doubleValue();
			// return (T)s;
		// }
		// else{
			// return null;
		// }
	// }
	
	// public static void main(String args[]){
		// System.out.println("Sum of Two Integers is :- "+add(3, 4));
		// System.out.println("Sum of Two Double vals is :- "+add(3.3,4.4));
	// }
// }
public class GenericsA{
	
	public static <T extends Number> T add(T x, T y){
		if(x instanceof Integer){
			return (T)(Integer)(x.intValue() + y.intValue());
		}
		else if(x instanceof Double){
			return (T)(Double)(x.doubleValue() + y.doubleValue());
		}
		else{
			throw new IllegalArgumentException("Invalid argument type");
		}
	}
	
	public static void main(String args[]){
		System.out.println("Sum of Two Integers is :- "+add(3, 4));
		System.out.println("Sum of Two Double vals is :- "+add(3.3,4.4));
	}
}
