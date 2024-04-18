package pck03_casting;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		char char1=str.charAt(0);
		System.out.println("한자리 숫자를 입력하세요 : "+char1);
		int char2=((int)char1-48)*((int)char1-48);
		System.out.println("입력한 숫자의 제곱은 "+char2+"입니다");
		sc.close();

	}

}
