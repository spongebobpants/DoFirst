package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//f(x)=(x^3-9x+2, x<=0) , (7x+2, x>0)
		double x,outcome;

		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자:");
		x = sc.nextDouble();
		
		if(x<=0) {
			outcome = (x*x*x)-(9*x)+2;
			System.out.println("계산결과는" +outcome+"입니다");
		}else {
			outcome = (7*x)+2;
			System.out.println("계산결과는"+outcome+"입니다");
		}
		sc.close();
	}

}
