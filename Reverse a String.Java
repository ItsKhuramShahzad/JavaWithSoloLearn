// Reverse a String

// Write a program to take a string as input and output its reverse.
// The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

// Sample Input:
// hello there

// Sample Output:
// ereht olleh
// You can loop through the char array, starting from the end, using arr.length to get the size of the array.
import java.util.Scanner;
import java.util.*;
public class Program
{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		char p1= arr[0]; //  p1 point to zero index
		int size= arr.length-1;
		char p2= arr[size]; // p2, pointing to last index
		for (int x=0; x<arr.length/2; x++){
			p1= arr[x];
			p2= arr[size];
			char val= p1;
           arr[x]=p2;
           arr[size]=val;
           size--;
		}
		for (int x=0;x<arr.length;x++) {
			System.out.print((arr[x]));
			
		}
		
	}
}
