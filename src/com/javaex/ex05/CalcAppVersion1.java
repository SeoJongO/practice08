package com.javaex.ex05;

import java.util.Scanner;

public class CalcAppVersion1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");
			String num = sc.nextLine();
			String[] nArray = num.split(" ");
			nArray[0] = nArray[0].trim();
			nArray[2] = nArray[2].trim();
			int f = Integer.parseInt(nArray[0]);
			int s = Integer.parseInt(nArray[2]);

				if (num.equals("/q")) {
					System.out.println("종료합니다.");
					break;

				} else if (nArray[1].equals("+")) {
					Add.setValue(f, s);
					System.out.println(">> " + Add.calculate());

				} else if (num.contains("-")) {
					nArray = num.split("\\-");
					Sub.setValue(f, s);
					System.out.println(">> " + Sub.calculate());

				} else if (num.contains("*")) {
					nArray = num.split("\\*");
					Mul.setValue(f, s);
					System.out.println(">> " + Mul.calculate());
				} else if (num.contains("/")) {
					nArray = num.split("\\/");
					Div.setValue(f, s);
					System.out.println(">> " + Div.calculate());
				} else {
					System.out.println("알 수 없는 연산자입니다.");
				}

		}
		sc.close();

	}
}