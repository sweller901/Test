package arrays;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bad bagger
		int num1 = 4;
		int num2 = 6;
		int num3 = 19;
		
		//...
		System.out.println(num1 + " " + num2 + " " + num3);
		// grouping of similar variables together;
		// very primitative array (good bagger)
		// index value  0 , 1   , 2
		//length value 1  ,  2  ,  3
		
		int[] arr1 = {num1, num2, num3};
		String[] arr2 = {"Think", "about", "it"};
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
		
		// numbers below show source address, where its located
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]); 
		}
	}

}
