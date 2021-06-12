package com.javaex.ex05;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class CalcAppVersion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");
			String num = sc.nextLine();
			String[] nArray = new String[2];

			if (num.equals("/q")) {
				System.out.println("종료합니다.");
				break;

			} else if (num.contains("+")) {
				nArray = num.split("\\+");
				nArray[0] = nArray[0].trim();
				nArray[1] = nArray[1].trim();
				int f = Integer.parseInt(nArray[0]);
				int s = Integer.parseInt(nArray[1]);
				Add.setValue(f, s);
				System.out.println(">> " + Add.calculate());

			} else if (num.contains("-")) {
				nArray = num.split("\\-");
				nArray[0] = nArray[0].trim();
				nArray[1] = nArray[1].trim();
				int f = Integer.parseInt(nArray[0]);
				int s = Integer.parseInt(nArray[1]);
				Sub.setValue(f, s);
				System.out.println(">> " + Sub.calculate());

			} else if (num.contains("*")) {
				nArray = num.split("\\*");
				nArray[0] = nArray[0].trim();
				nArray[1] = nArray[1].trim();
				int f = Integer.parseInt(nArray[0]);
				int s = Integer.parseInt(nArray[1]);
				Mul.setValue(f, s);
				System.out.println(">> " + Mul.calculate());
			} else if (num.contains("/")) {
				nArray = num.split("\\/");
				nArray[0] = nArray[0].trim();
				nArray[1] = nArray[1].trim();
				int f = Integer.parseInt(nArray[0]);
				int s = Integer.parseInt(nArray[1]);
				Div.setValue(f, s);
				System.out.println(">> " + Div.calculate());
			} else {
				System.out.println("알 수 없는 연산자입니다.");
			}

		}
		sc.close();

	}
}
