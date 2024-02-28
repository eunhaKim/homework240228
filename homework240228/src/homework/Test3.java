package homework;

import java.util.Scanner;

// 1~3번 모두 if문이나 switch~case문이나 while문을 사용해서 작성하시오.
// 3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되, 한줄에 5개씩 출력하는 프로그램을 만드시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리 숫자를 입력해주세요 : ");
		int su = sc.nextInt();
		int num = 0;
		
		while(su > 0) {
			System.out.print(su+" ");
			su--;
			num++;
			if(num%5 == 0) System.out.println();
		}
		
		sc.close();
	}
}
