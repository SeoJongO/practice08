package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] fArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < fArray.length; i++) {

			String list = sc.nextLine();
			String[] fiArray = list.split(" ");

			Friend User = new Friend();
			User.setName(fiArray[i]);
			User.setHp(fiArray[i]);
			User.setSchool(fiArray[i]);

			fArray[i] = User;

		}

		// 친구정보 출력
		for (int i = 0; i < fArray.length; i++) {
			fArray[i].showInfo();
		}

		sc.close();
	}

}
