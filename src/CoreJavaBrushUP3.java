
public class CoreJavaBrushUP3 {

	public static void main(String[] args) {
		
		//What is String? - String is an Object that represent sequence of characters 
		// String Literal
		String s ="Vibhuti Vivek Parmar";
		String s1 = "Vibhuti Vivek Parmar"; // only one object created bcz value is already present
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcomme"); // Here it create two different object as we explicitly say to create new object.
		
		String sp = "Rahul Shetty Academy";
		String[] splt = sp.split("Shetty");
		
		for(int i=0; i<splt.length; i++) {
			System.out.println(splt[i]);
		}
		
		for(int i=0; i<splt.length; i++) {
			System.out.println(splt[i].trim()); //trim() remove white space from left and right
		}
		
		for(int i=sp.length()-1; i>=0; i--) {
			System.out.println(sp.charAt(i));
		}

	}

}
