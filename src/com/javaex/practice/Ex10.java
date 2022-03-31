package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.println("사번:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch(num%3) {
		case 0:
			System.out.println("A팀입니다");
			break;
		case 1:
			System.out.println("B팀입니다");
			break;
		case 2:
			System.out.println("C팁입니다");
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		sc.close();
	}

}
