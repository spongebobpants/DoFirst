package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int height;
		int weight;
		
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.println("키:");
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		System.out.println("몸무게:");
		weight = sc.nextInt();
		if(weight<(height-100)*0.9) {
			System.out.println("저체중입니다");
		}else if(weight>(height-100)*0.9){
			System.out.println("과체중입니다");
		}else {
			System.out.println("표준입니다");
		}System.out.println("표준체중: "+ (height-100)*0.9);
		
		
	}
}
