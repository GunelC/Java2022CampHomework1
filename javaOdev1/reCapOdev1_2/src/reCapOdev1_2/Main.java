package reCapOdev1_2;

public class Main {

	public static void main(String[] args) {

		double[] myList = {0.3, 9.4, 3.7, 23.4 };
		double total = 0;
		double max = myList[0];	
		for(double number: myList) {
			if(max < number) {
				max = number;
			}	
			total = total + number;
			System.out.println(number);
		}
		
		
		System.out.println("Toplam = " + total);
		System.out.println("En büyük sayı = " + max);
	}

}
