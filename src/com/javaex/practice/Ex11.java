package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alphabet;
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳:");
		Scanner sc = new Scanner(System.in);
		
		alphabet = sc.next().charAt(0);
		//charAt는 스캐너에서 char 타입을 못 쓰기 때문에
		//숫자 0으로 0번째 string 문자를 char로 쓸 수 있다.
		
//		switch(alphabet) {
//		case 'a':
//			System.out.println("모음입니다");
//			break;
//		case'e':
//			System.out.println("모음입니다");
//			break;
//		case 'i':
//			System.out.println("모음입니다");
//			break;
//		case 'o':
//			System.out.println("모음입니다");
//			break;
//		case 'u':
//			System.out.println("모음입니다");break;
//			
//		}sc.close();
		
		switch(alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("모음입니다");
			break;
		default:
			System.out.println("자음입니다");
		}
		sc.close();
	}

}
