import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import java.util.Scanner; 
public class main2 {

	public static void main(String[] args) {
//		int visitCount = 0;
//		if(visitCount == 0){
//			visitCount++;
//			System.out.println("����");
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
//		System.out.print("���� ���� [����/����]:");
//		choice = sc.next();
//		String str1 = "����";
//		String str2 = "����";
//		if(choice.contentEquals(str1)) {
//			System.out.println("������ �ڳʴ� 12���Դϴ�.");
//			
//		}
//		else{
//			System.out.println("������ �ڳʴ� 1���Դϴ�.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���� [����/����]:");
//		String gender = sc.nextLine();
//		if(gender.equals("����")) {
//			System.out.println("������ �ڳʴ� 12���Դϴ�.");
//		}
//		if(gender.equals("����")) {
//			System.out.println("������ �ڳʴ� 1���Դϴ�.");
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
//		System.out.println("����⵵�� �Է��Ͻÿ� :");
//		int birth =pYear - sc.nextInt()+1;
//		
//		if(birth>=20) {
//			System.out.println("�����Դϴ�.");
//			System.out.println(birth+"��");
//		}
//		else {
//			System.out.println("������ �ƴմϴ�");
//			System.out.println(birth+"��");
//		}
//		long mSec = System.currentTimeMillis();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		
//		String time = df.format(mSec);
//		System.out.println("���� �ð� : "+time);
//		
//		Date today = new Date(mSec);
//		System.out.println("���� �ð� : "+today);
		
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
//				System.out.println("����");
//			}else {
//				System.out.println("¦");
//			}
//		}
//		else {
//			System.out.println("Ȧ");
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� :");
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
		
		System.out.println("���� :"+score);
		System.out.println("���� :"+grade);
		
		
	}
	
}
