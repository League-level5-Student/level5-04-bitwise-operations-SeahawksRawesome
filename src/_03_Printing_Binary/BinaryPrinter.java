package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		// Print the result using System.out.print (NOT System.out.println)
		//Use this method to print the remaining 7 bits of b
		byte c = 0;
		for(int i  = 0; i < 8; i++) {
			c = (byte) (b >> (7-i));
			c = (byte) (c & 1);
			System.out.print(c);
		}
			
		
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte c = (byte) (s >> 8);
		byte b = (byte) s;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		printByteBinary(c);
		printByteBinary(b);
		//b = (byte) ()
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short c = (short) (i >> 16);
		short b = (short) i;
		
		
		printShortBinary(c);
		printShortBinary(b);
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int c = (int) (l >> 32);
		int b = (int) l;
		
		printIntBinary(c);
		printIntBinary(b);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter b = new BinaryPrinter();
		b.printByteBinary((byte) 27);
		System.out.println("\n");
		b.printShortBinary((short) 129);
		System.out.println("\n");
		b.printIntBinary(10000000);
		System.out.println("\n");
		b.printLongBinary((long) 100000000);
	}
}