package pkg04_homework;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 키순서대로 앉으세요.");
		System.out.println("2. 값 입력 받아 배열 만들기");
		System.out.println("3. 올라갔다 내려갔다");
		System.out.println("4. 로또 번호 자동 생성기");
		System.out.println("5. 컴퓨터와 가위바위보");
		System.out.println("6. 배열 늘리기");
		System.out.print("선택 : ");
		int select= sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("1. 키순서대로 앉으세요 실행");
			new Practice().q1();
			break;
		case 2:	
			System.out.println("2. 값 입력 받아 배열 만들기 실행");
			new Practice().q2();
			break;
		case 3:	
			System.out.println("3. 올라갔다 내려갔다 실행");
			new Practice().q3();
			break;
		case 4:
			System.out.println("4. 로또 번호 자동 생성기 실행");
			new Practice().q4();
			break;
		case 5:
			System.out.println("5. 컴퓨터와 가위바위보 실행");
			new Practice().q5();
			break;
		case 6:	
			System.out.println("6. 배열 늘리기 실행");
			new Practice().q6();
			break;
		}
		sc.close();
	}
}

