package homework;

import java.util.Scanner;

// 2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함???? 이상하다...ㅠㅠ)
// 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, temp, tot=0, num=0;
		
		System.out.print("첫번째 숫자 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		su2 = sc.nextInt();
		
		// su1이 더 작은수로 변환하는 부분
		if(su1 > su2) {
			temp = su1; su1 = su2; su2 = temp;
		}
		
		while(su1 < su2-1) {
			su1++;
			num++;
			tot += su1;
			System.out.print(su1 + " ");
			if(num%5 == 0) System.out.println();
		}
		
		System.out.println("\n두개 숫자 사이에 값들을 모두 더하면 나오는 값 : " + tot);
		
		sc.close();
	}
}
