package calendar;

import java.util.Scanner;

public class SUNday {
	public static void main(String[] args) {
		//키보드입력
		//화면에 출력
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력해 주세요");
		
		String s1,s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//int c = a+b;
		//System.out.println("두 수의 합은"+(a+b)+"입니다");
		System.out.printf("%d와%d의 합은 %d입니다",a,b,a+b);
		scanner.close();

	}

}
