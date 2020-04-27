import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import java.util.Scanner; 
public class main2 {

	public static void main(String[] args) {
//		int visitCount = 0;
//		if(visitCount == 0){
//			visitCount++;
//			System.out.println("ㅎㅇ");
//			
//		}
//		if(visitCount != 0){
//			System.out.println("nn");
//			
//		}
//		visitCount++;
//	}
//		String choice ;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("성별 선택 [남자/여자]:");
//		choice = sc.next();
//		String str1 = "남자";
//		String str2 = "여자";
//		if(choice.contentEquals(str1)) {
//			System.out.println("남성복 코너는 12층입니다.");
//			
//		}
//		else{
//			System.out.println("여성복 코너는 1층입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("성별 선택 [남자/여자]:");
//		String gender = sc.nextLine();
//		if(gender.equals("남자")) {
//			System.out.println("남성복 코너는 12층입니다.");
//		}
//		if(gender.equals("여자")) {
//			System.out.println("여성복 코너는 1층입니다.");
//		}
//		System.currentTimeMillis();
//		long cTime = System.currentTimeMillis();
//		long cSec = cTime/ 1000;
//		long cMin = cSec / 60;
//		long cHour = cMin / 60 + 9;
//		int cDay = (int)cHour / 24 ;
//		int cYear = cDay /365;
//		System.out.println("cTime="+cTime);
//		System.out.println("cSec ="+cSec);
//		System.out.println("cSec ="+cMin);
//		System.out.println("cSec ="+cHour);
//		System.out.println("cSec ="+cDay);
//		System.out.println("cSec ="+cYear);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		int pYear = (int)((System.currentTimeMillis()/1000/60/60+9)/24/365)+1970;
//		System.out.println("출생년도를 입력하시오 :");
//		int birth =pYear - sc.nextInt()+1;
//		
//		if(birth>=20) {
//			System.out.println("성인입니다.");
//			System.out.println(birth+"살");
//		}
//		else {
//			System.out.println("성인이 아닙니다");
//			System.out.println(birth+"살");
//		}
//		long mSec = System.currentTimeMillis();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		
//		String time = df.format(mSec);
//		System.out.println("현재 시간 : "+time);
//		
//		Date today = new Date(mSec);
//		System.out.println("현재 시간 : "+today);
		
//		int upper = (int)(Math.random()*26)+ 'A';
//		
//		System.out.println("Upper :"+(char)upper);
		
//		int dice = (int)(Math.random()*6)+1;
//		int dice2= (int)(Math.random()*6)+1; 
//		
//		int num = dice + dice2;
//		
//		System.out.println("first :"+dice);
//		System.out.println("first :"+dice2);
//		
//		if(num % 2 == 0) {
//			if(dice == dice2) {
//				System.out.println("더블");
//			}else {
//				System.out.println("짝");
//			}
//		}
//		else {
//			System.out.println("홀");
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 :");
		int score = sc.nextInt();
		char grade = ' ';
		if(score>=90) 
			grade = 'A';
		else if(score>=80) 
			grade = 'B';
		else if(score>=70) 
			grade = 'C';
		else if(score>=60) 
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("점수 :"+score);
		System.out.println("점수 :"+grade);
		
		
	}
	
}
