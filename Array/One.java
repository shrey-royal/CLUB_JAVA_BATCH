import java.util.Scanner;
import java.util.Random;

public class One {
	public static void main(String[] args) {
		// int[] arr;	//object declaration
		// arr = new int[10];	//object instantiation
		
		// int[][] arr = new int[3][3];
		/*
		int[][] arr;
		int[] []arr;
		int [][]arr;
		int arr[][];
		int[] arr[];
		int []arr[];
		int arr[][];
		*/
		
		int arr[] = new int[5];
		// Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100);
			// arr[i] = (int)(Math.random() * 100);
		}
		
		for(int i=0; i<arr.length; i++) {
			println("arr["+i+"] = " + arr[i]);
		}
		
		// sc.close();
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void print(String str) {
		System.out.print(str);
	}
}