package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("숫자 2개를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1: ");
		num1 = sc.nextInt();
		
		System.out.println("숫자 2: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("큰수 : "+num1 + "작은 수:"+ num2) ;
		}else {
			System.out.println("큰수 : "+num2 + "작은 수:"+ num1) ;
		}
	}

}
