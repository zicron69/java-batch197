package day01;

import java.util.Scanner;

public class Soal05 {
	public static java.util.Scanner input;
	
	public static void main(String[] args) {
	
		input = new Scanner(System.in);
	System.out.println("input your number : ");
		int n = Integer.parseInt(input.nextLine());

		int number=1;
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.println("*" + "\t");
			} else {
			System.out.println(number +"\t");
			number=number+4;
		}
	
		}
	}

}
