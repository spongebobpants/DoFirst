package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이");
		age = sc.nextInt();
		
		if(65>age && age>19) {
			System.out.println("1번 그룹입니다");
		}else {
			System.out.println("2번 그룹입니다");
		}
		
	}

}
