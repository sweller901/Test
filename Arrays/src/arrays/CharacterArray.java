package arrays;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String phraseTwo = "Meet me in St Louis";
		//char[] charArrBok = phraseTwo.toCharArray();
		//for (int i = 0; i < charArrBok.length; i++)
			//System.out.print("'" + (int)charArrBok[i] + "',");
		
		//char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		//System.out.println(city);
		
//							 0 | 1| 2| 3| 4|		
		//double[] listFour = {1, 2, 3, 4, 5};
		//double total =0;
		//
		//for(int i = 0; i < listFour.length; i++) {
			// total is assigned to itself (total) + listFour[i];
			//
			//total += listFour[i];
			//System.out.println(total);
		//}
	//	System.out.println(total);
		
		//double[] listFive = {34.5, 67.2, 56.3, 21.8};
		//double max = listFive[0]; 
		//for(int i = 0; i < listFive.length; i++) {
			//if(listFive[i] > max) {
				//max = listFive[i];
				//System.out.println(listFive[i]);
			//}
		//}
		//for (int i = 0; i < listFive.length; i++) {
		//	System.out.print(listFive[i] + " ");
		
		double[] listFive = {34.5, 67.2, 56.3, 21.8};
				
				for (int i = 0; i < listFive.length; i++) {
					System.out.println("Outer loop is at: " + i);
					for (int j = 0; j < listFive.length; j++) {
						System.out.println("Inner loop is at: " + j);
						if (listFive[j] < listFive[j + 1]) {
							double temp = listFive[j];
							listFive[j] = listFive[j + 1];
							listFive[j + 1 ] = temp;
						}
					}
		}
				double highest = listFive[listFive.length - 1];
				System.out.println(highest);
				for (int i = 0; i < listFive.length; i++) {
					System.out.print(listFive[i] + " ");
		}
	
		
	}
}
