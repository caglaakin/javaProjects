package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,12.5,5.6,9.2};
		
		
		double max = myList[0];
		double total=0;
		
		for(double number:myList) {
			
			if(max<number) {
				max=number;				
			}
			
			total+=number;
			System.out.println(number);
			
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük sayı : " + max);
		
	}

}