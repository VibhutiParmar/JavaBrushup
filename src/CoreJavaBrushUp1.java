
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		//Variable
		
		int num = 19;
		String name = "Vibhuti";
		char letter = 'V';
		double dec = 19.05;
		boolean myName = true;
		
		//To print in console
		
		System.out.println(num + " is the value store in the num variable.");
		System.out.println(name + " is the value store in the name variable.");
		System.out.println(letter + " is the value store in the letter variable.");
		System.out.println(dec + " is the value store in the dec variable.");
		System.out.println(myName + " is the value store in the myName variable.");
		
		//Arrays
		
		//Two Way to declare array
		
		//Way 1 -  When you do not know the which value you need to enter or you have to fetch the value from browser
		
		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 5;
		arr1[3] = 7;
		arr1[4] = 9;
		
		//Way 2 - When you know the values already
		
		int[] arr2 = {2,3,4,5,6,4,12,14,15,20,11,19};
		
		System.out.println(arr2[4]);
		
		//for loop
		//arr2.lenght = 5 
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("....................");
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("....................");
		
		String[] myFullName = {"Vibhuti", "Vivek", "Parmar"};
		
		for(int i=0; i<myFullName.length;i++) {
			System.out.println(myFullName[i]);
		}
		System.out.println("....................");
		for(int a : arr2) {
			System.out.println(a);
		}
		System.out.println("....................");
		
		for(String s : myFullName) {
			System.out.println(s);
		}
}
}

