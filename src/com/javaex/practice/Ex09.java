package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.print("첫번째 숫자: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();

		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			if (num1 % num2 == 0) {
				System.out.println(num2 + "는(은)" + num1 + "의 약수이다");
			} else {
				System.out.println(num2 + "는(은)" + num1 + "의 약수가 아닙니다");
			}
		} else {
			if (num2 > num1) {
				if (num2 % num1 == 0) {
					System.out.println(num1 + "는(은)" + num2 + "의 약수이다");
				} else {
					System.out.println(num1 + "는(은)" + num2 + "의 약수가 아닙니다");

				}
			}
			sc.close();
		}
	}

}
