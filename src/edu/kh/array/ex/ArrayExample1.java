package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	
	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열 명으로 불러지고
	 * 	 구분은 index를 이용한다. (index는 0부터 시작하는 정수)
	 */

	// 변수 vs 배열
	public void ex1() {
		
		// 변수선언
		int num;
		// Stack 영역에 int자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여한다.
		
		// 변수대입
		num = 10;
		// 생선된 num이라는 공간에 10을 대입한다.
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 만들어진 자리에 num에 저장된 값을 읽어와서 출력한다.
		// 출력 -> num에 저장된 값 : 10
		
		// 배열 선언
		int arr[];
		// stack영역에 int[] (int배열)자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여한다.
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		// 배열 할당
		arr = new int[3];

		// new : "new 연산자"라고하며 Heap 메모리 영역에 새로운 공간(배열,객체)을 할당
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열

		// new int[3] : heap 영역에 int 3칸짜리 int[]을 할당(생성)하는 것
		// ** 생성된 int[]에는 시작 주소가 지정된다.
		
		// arr = new int[3];
		// (int[])  (int[])  -> 같은 자료형 == 연산가능함
		
		// heap영역에 생선된 int[]의 시작주소를
		// stack 영역에 생성된 arr 변수에 대입
		
		// -> arr변수가 int[]을 참조하게됨
		// 그래서 arr을 참조형이라고함.
		
		// 배열 요소에 값 대입
		// arr은 int[] 참조형 변수 이지만
		// arr[0]은 int자료형 변수이기 때문에 정수값을 대입할 수 있다.
		
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		System.out.println("arr의 주소값 ? : " + arr); 
		
		// 배열 요소값 읽어오기
		// arr이 참조하고있는 배열의 n번째 인덱스 값을 받아옴
		System.out.println(arr[0]); 
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;

		// 배열의 길이 (몇 칸인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열 안에 있는 요소들의 값을 불러올 때
		// 배열과 for문 사용
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
	}
	
	//예제
	public void ex3() {
		// 5명의 키cm를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		// 평균 : ~cm
		
		double[] height = new double[5];
		// double[] 자료형 참조변수 height를 stack영역에 생성하고
		// stack영억의 height에 
		// heap영역에 새로 생성된 double 5칸짜리 double[]의 시작주소를 대입해라
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			// 각 인덱스에 입력받은 값을 대입(초기화)하는 것
		}
	
		System.out.println();
		
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			
			sum += height[i]; // 배열에 저장된 값을 sum에 누적
		}
		
		System.out.printf("평균 : %.2f", sum / height.length);
		
	}

	//예제
	public void ex4() {
		// 입력받은 인원 수 만큼 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// 입력 받을 인원 수 : 
		// n번 점수 입력 :
		// n번 점수 입력 :
		// n번 점수 입력 :
		
		// 합계 :
		// 평균 : 
		// 최고점 :
		// 최저점 :
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 크기만큼(input)
		int[] score = new int[input];
		
		//System.out.println();
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {

			System.out.print( (i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();

			sum += score[i];
		}
		
		// 최고/최저점 구하기
		int max = score[0];
		int min = score[0]; 
		
		// 아래 for문을 이용해서 score배열에 있는 모든 값과 max, min을 비교
		// score[i]값이 max보다 크면 max에 대입
		// score[i]값이 min보다 작으면 min에 대입
		for(int i =0; i < score.length; i++) {
			
			if(score[i] > max) {
				max = score[i];
			}
			
			if(score[i] < min) {
				min = score[i];
			}
			
		}
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double) sum/score.length);
		System.out.printf("최고점 : %d\n", max);
		System.out.printf("최저점 : %d\n", min);
		
	}

	// 배열 선언/초기화 동시에 하기
	public void ex5() {
		
		char[] arr = new char[5];
		
		// char[] arr이 참조하는 배열 요소에 A, B, C, D, E 대입하기
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
			// A == 65
			// B == 66
			// C == 67
		}
		
		// ** Arrays 클래스
		// -> 자바에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		// Arrays.toString(배열명) : 해당 배열에 있는 모든 요소 값을 출력
		int[] arr2 = new int[5];
		
		System.out.println( Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		// 배열 선언과 동시에 할당/초기화
		// {} 중괄호는 배열의 리터럴 표기법
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		System.out.println(Arrays.toString(arr3));
		
	}
	
	// 예제
	public void ex6() {
		// 점심메뉴 뽑기 프로그램
		
		String[] arr = {"김밥", "서브웨이", "햄버거", "파스타"};
		
		System.out.println("오늘 점심 메뉴 : " + arr[(int)Math.random() * 5]);
		
		
	}
	
	// 예제
	public void ex7() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기위한 변수 > flag(false / true 변수)
		
		boolean flag = false; // 검사 전에는 없다고 가정
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = true; // 일치하는 값이 있으므로 true로 변경
			}
		}

		// flag 상태를 검사
		if(!flag){ // flag == false
			System.out.println("존재하지 않음");
		}
		
	}
	
	// 예제
	public void ex8() {
		// 입력받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 존재하지않으면 "존재하지 않음" 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(input)) { //String 비교시 equals 사용해야함
				System.out.println(i + "번째 인덱스에 존재");
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	// 예제
	public void ex9() {
		// 문자열을 입력받아 한 글자씩 잘라내어 char배열에 순서대로 저장
		// 문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인
		// 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
		
		// [아래 사용하기]
		// 1) 배열 검색
		// 2) String.length() : 문자열의 길이
		// 		예 : "Hello".length() -> 5
		
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
		//		예 : "Hello".charAt(1); -> e
		
		// 4) count 숫자세기
		
		// 문자열을 입력받아 한 글자씩 잘라내어 char배열에 순서대로 저장
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine(); // 한줄(띄어쓰기 포함) 입력받기
		
		char[] arr = new char[input.length()];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			// arr[i]에 입력받은 문자열 중 i번째 문자를 대입
		}
		
		// 중간확인
		//System.out.println(Arrays.toString(arr));
		
		// 문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인
		// 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
		
		System.out.print("검색할 문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int count = 0; //같은글자 갯수를 세기 위한 변수
		
		for (int i =0; i < arr.length; i++) {
			
			if(arr[i] == ch) {
				count ++;
			}
		}
				
		if(count == 0) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println( count + "개 있음");
		}
	}
	
}
