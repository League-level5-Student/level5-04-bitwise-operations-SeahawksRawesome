package _03_Printing_Binary;

public class BinaryPrinter_Personal {

	
	public static void main(String[] args) {
		BinaryPrinter_Personal b = new BinaryPrinter_Personal();
		
		b.printIntBinary(50);
	}
	
	public void printByteBinary(byte b) {
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		
		int total = 0;
		for (int x = 0; x < 20; x++) {
			if (i % 2 == 1) {
				total = total * 10;
				total += 1;
				i = (int) Math.floor(i / 2);
				System.out.println("total: " + total);
				System.out.println("i: " + i);
			} 
			else if (i == 0) {
				System.out.println("Broken");
				break;
			} else {
				total = total * 10;
				//total += 0;
				i = i / 2;
			}
		}
		System.out.println("Final Binary Form " + total);
		
	}
	
	public void printLongBinary(long l) {
	
	}
	

}
