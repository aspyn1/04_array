package edu.kh.array.practice.run;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
			순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
			짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
			
			[실행 화면]
			1 2 3 4 5 6 7 8 9
			짝수 번째 인덱스 합 : 25
		 */
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = i+1;		
			
			if(i % 2 == 0 || i == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}


	public void ex2() {//완성x
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
			순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
			홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
			
			[실행 화면]
			9 8 7 6 5 4 3 2 1
			홀수 번째 인덱스 합 : 20
		 */
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			
			for(int x = 9; x >= 1; x--) {
				arr[i] = x;
			}
			
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}

	
	public void ex3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			양의 정수 : 5
			1 2 3 4 5
		 */
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	
	public void ex4() {
		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고
			검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
			배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
			
			[실행 화면 1]
			입력 0 : 5
			입력 1 : 8
			입력 2 : 9
			입력 3 : 10
			입력 4 : 4
			검색할 값 : 8
			인덱스 : 1
			
			[실행 화면 2]
			입력 0 : 5
			입력 1 : 8
			입력 2 : 9
			입력 3 : 10
			입력 4 : 4
			검색할 값 : 1
			일치하는 값이 존재하지 않습니다.
		 */
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {

			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			arr[i] = input;
		}

		boolean flag = false;
	
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		for(int x = 0; x < arr.length; x++) {
			
			if(arr[x] == search) {
				System.out.println("인덱스 : " + x);
				flag = true;
			}
		}

		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}

	
	public void ex5() { //application에 i가 존재하는 위치(인덱스) : 4 8 x
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		   	검색할 문자가 문자열에 몇 개 들어가 있는지 개수와
			몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
			
			[실행 화면]
			문자열 : application
			문자 : i
			application에 i가 존재하는 위치(인덱스) : 4 8
			i 개수 : 2
		 */
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("검색할 문자 : ");
		char ch = sc.next().charAt(0);
		 
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == ch){
				count++;
				System.out.println(input + "에 "+ ch + "가 존재하는 위치(인덱스) : " + i);
			}
		}
		System.out.println(ch + " 개수 : " + count);
	}

	
	public void ex6() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
			
			[실행 화면]
			정수 : 5
			배열 0번째 인덱스에 넣을 값 : 4
			배열 1번째 인덱스에 넣을 값 : -4
			배열 2번째 인덱스에 넣을 값 : 3
			배열 3번째 인덱스에 넣을 값 : -3
			배열 4번째 인덱스에 넣을 값 : 2
			4 -4 3 -3 2
			총 합 : 2
		 */

		int sum = 0;
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			
			arr[i] = num;
			sum += num;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}

	
	public void ex7() { // 완성x
		/*
		 * 주민등록번호 번호를 입력 받아 
		   성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.

			[실행 화면]
			주민등록번호(-포함) : 123456-1234567
			123456-1******
		 */
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[14];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if(i > 6) {
				i = '*';
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	
	public void ex8() {
		
	}

	
	public void ex9() {
		
	}

	
	public void ex10() {
		
	}

	
	public void ex11() {
		
	}

	
	public void ex12() {
		
	}

	
	public void ex13() {
		
	}

	
	public void ex14() {
		
	}


	

}
