
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d =new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		String n1 = d1.getUserData();
		System.out.println(n1);
		
		String s = getData1();
		System.out.println(s);
		
		

	}
	
	public String getData() {
		System.out.println("Hello World");
		return "Vibhuti";
	}
	
	public static String getData1() {
		System.out.println("Hello World");
		return "Parmar";
	}
	

}
