package com.javaex.ex05;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] nArray = num.split("\\+");

		System.out.println(nArray[0]);
		System.out.println(nArray[1]);

		sc.close();
	}

}
