package calendar;

import java.util.Scanner;

public class SUNday {
	public static void main(String[] args) {
		//Ű�����Է�
		//ȭ�鿡 ���
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �Է��� �ּ���");
		
		String s1,s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//int c = a+b;
		//System.out.println("�� ���� ����"+(a+b)+"�Դϴ�");
		System.out.printf("%d��%d�� ���� %d�Դϴ�",a,b,a+b);
		scanner.close();

	}

}
