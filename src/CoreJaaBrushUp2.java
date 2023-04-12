import java.util.ArrayList;

public class CoreJaaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr2 = {2,3,4,5,6,4,12,14,15,20,11,19};
		
		
		//2,4,6,4,12,14,20,
		for (int i = 0; i<arr2.length; i++) {
			if(arr2[i]%2 == 0) {
				System.out.println(arr2[i]);
			}
		}
		
		//Create an object of ArrayList class
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vibhuti");
		a.add("Vivek");
		a.add("Parmar");
		a.add("Canada");
		System.out.println(a.get(2));
		System.out.println("....................");
		
		for(int i =0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
