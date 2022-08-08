package Movie2;

public class Movie {
	  String movieName;
	  int price;
	  int age;
	  int money;
	  double rate;
	  String way;
	  
	  //생성자
	  public Movie(String movieName, int price, int age, String way) {
	//매개변수로 값을 받아서 멤버변수에 넣기
		this.movieName=movieName;  
		this.price=price;
		this.age=age;
		this.way=way;
	  }
	  //메소드
	    //할인율
	  double rateCal() {
		  if(age<20) rate=0.25;
		  else if(20<=age&& age<=30) rate=0.2;
		  else if(age>=30) rate=0.15;
		 if(way=="현장")rate=rate;
		 else if(way=="인터넷")rate=rate+0.05;
		else if(way=="쿠폰")rate=rate+0.1;
		return rate;  
	  }
	  
	  //실구매금액
	  void moneyCal() {
		  money=(int) (price*(1-rate));
	  }
	  
	  //제목 인쇄하기
	  void titlePrint() {
		System.out.println(movieName);  
		  
	  }
	  
	  //내용 출력하기
	  void dataPrint() {
			System.out.println(movieName+"\t\t"+ price+"\t\t"+age+"\t\t"+money);
			
		}
	  
	}