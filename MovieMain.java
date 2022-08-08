package Movie2;

import java.util.Scanner;

public class MovieMain {
private static Scanner sc;

	public static void main(String[] args) {

	sc = new Scanner(System.in);
	System.out.println("************************************");
	System.out.println("어서오세요 영화 예매 프로그램 입니다.");
	System.out.println("************************************");
	System.out.println("");
	System.out.println("************************************");
	System.out.println("현재 상영중인 영화는 다음과 같습니다.");
	System.out.println("");
	System.out.println("1.1917 |2. 주 디 | 3. 인비저블맨");
	System.out.println("************************************");
	System.out.println("영화를 입력하세요>");
	String a = sc.nextLine();
	System.out.println("입장료를 선택하세요>");
	int b = sc.nextInt();
	System.out.println("나이를 입력하세요>");
	int c = sc.nextInt();
    
  	Movie mv1= new Movie(a,b,c,null);
  	mv1.rate=mv1.rateCal();
    mv1.moneyCal();
	System.out.println("영화명\t\t금액\t\t나이\t\t실구매금액\t");
	mv1.dataPrint();
	
	sc = new Scanner(System.in);
	System.out.println("영화를 입력하세요>");
	String aa = sc.nextLine();
	System.out.println("입장료를 선택하세요>");
	int bb = sc.nextInt();
	System.out.println("나이를 입력하세요>");
	int cc = sc.nextInt();

	Movie mv2= new Movie(aa,bb,cc,null);
	mv1.rate=mv1.rateCal();
    mv2.rate=mv2.rateCal();
	
    mv1.moneyCal();
	mv2.moneyCal();
	
	System.out.println("영화명\t\t금액\t\t나이\t\t실구매금액\t");
	mv1.dataPrint();
	mv2.dataPrint();
	
	sc = new Scanner(System.in);
	System.out.println("영화를 입력하세요>");
	String aaa = sc.nextLine();
	System.out.println("입장료를 선택하세요>");
	int bbb = sc.nextInt();
	System.out.println("나이를 입력하세요>");
	int ccc = sc.nextInt();
	System.out.println("감사합니다");
	Movie mv3= new Movie(aaa,bbb,ccc,null);
	mv1.rate=mv1.rateCal();
    mv2.rate=mv2.rateCal();
	mv3.rate=mv3.rateCal();
    mv1.moneyCal();
	mv2.moneyCal();
	mv3.moneyCal();
	System.out.println("영화명\t\t금액\t\t나이\t\t실구매금액\t");
	mv1.dataPrint();
	mv2.dataPrint();
	mv3.dataPrint();

	}

}