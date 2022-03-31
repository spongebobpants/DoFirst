package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		System.out.print("숫자1:");
		double num1 = sc.nextInt();
		
		System.out.print("숫자2:");
		double num2 = sc.nextInt();
		
		switch(a) {
			case '+':
				System.out.println("결과는:"+num1+num2);
				break;
			case '-':
				if(num1>num2) {
					System.out.println("결과는:"+(num1-num2));
				}else{
					System.out.println("결과는:"+(num2-num1));
				}
			break;
			case '*':
				System.out.println("결과는:"+(num1*num2));
				break;
			case '/':
				if(num1>num2 && !(num2 ==0)) {
					System.out.println("결과는:"+(num1/num2));
				}else if (num2>num1 && !(num1 ==0)) {
					System.out.println("결과는:"+(num2/num1));
				}else {
					System.out.println("계산할 수 없습니다");
				}
			break;
		}
	}

}
