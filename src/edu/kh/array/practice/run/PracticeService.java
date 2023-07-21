package edu.kh.array.practice.run;

import java.util.Arrays;
import java.util.Collections;
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


	public void ex2() {
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
			
			arr[i] = 9-i;
		
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

	
	public void ex8() {  //완성x
		/*
		 * 3이상인 홀수를 입력 받아 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		
		[실행 화면]
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1
		 */
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		if(input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
		}else if(input >= 3 && input % 2 != 0) {
			
			for(int i = 0; i < arr.length; i++){
				
				if(i <= arr.length/2+1) {
					arr[i] = i;
					Arrays.sort(arr);
				}else {
					arr[i] = i-1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
 	}

	
	public void ex9() { // 질문 : 랜덤 선언은 왜 밖에다 하면 안되고 포문 안에해야되는건가
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
			1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {

			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	
	public void ex10() { // min값이 이상함
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
			1~10 사이의 난수를 발생시켜 배열에 초기화 후
			배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
			
			[실행 화면]
			발생한 난수 : 5 3 2 7 4 8 6 10 9 10
			최대값 : 10
			최소값 : 2
		 */
		
		int[] arr = new int[10];
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i < arr.length; i++) {
		
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			if(max <= arr[i]) {
				max = arr[i];
			}
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	
	public void ex11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			4 1 3 6 9 5 8 10 7 2
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == arr[x]) {
					i--;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	
	public void ex12() {
		/*
		 * 로또 번호 자동 생성기 프로그램을 만들기.
			(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
			
			[실행 화면]
			3 4 15 17 28 40
		 */
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random() * 45 + 1);
			lotto[i] = random;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	
	public void ex13() {
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			문자의 개수와 함께 출력하세요.
			
			[실행 화면]
			문자열 : application
			문자열에 있는 문자 : a, p, l, i, c, t, o, n
			문자 개수 : 8
		 */
		
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			count++;
		}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < arr.length; i++) {
			
			if(i+1 < arr.length) {
				System.out.print( arr[i] + ", ");
			}else {
				System.out.print( arr[i]);
			}
		}
		System.out.print("\n" + "문자 개수 : " + count);
	}

	
	public void ex14() { // 완성x
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
			배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
			
			단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
			
			사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 */
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			String str = sc.nextLine();
			
			arr[i] = str;
			
			if(i+1 == input) {
				
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char yesno = sc.next().charAt(0);
				
				if(yesno == 'y') { // 데이터 늘리기 배열 복사..? 늘리기..?
					System.out.print("더 입력하고 싶은 개수 : ");
					int input2 = sc.nextInt();
					
					
				}else {
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}

}
