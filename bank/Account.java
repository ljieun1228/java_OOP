package bank;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;


public class Account {
	final static String BANK_NAME = "국민은행";//상수처리 하였음. 필드에서는 할당연산자를 사용할수 없으나, static 을 사용하면 가능하다... 
	String accountNum; //인스턴스 변수 : 객체가 아니다.(값을 할당받지 않았기 때문에)
	int money;
	String today;
	
	Account(int money){ //파라미터
		this.accountNum = this.generatorAccountNum();//객체
		this.money = money; // 객체아님 스트링은 객체 인트는 객체 아님
		this.today = this.today();
	}
	public String generatorAccountNum(){
		String accountNum = "";
		Random random = new Random();
		for(int i = 0; i<8;i++){
			if(i!=3){
				accountNum += random.nextInt(10);
			}else{
				accountNum += random.nextInt(10)+" - ";}
		}
		return accountNum;
	}
	public String today(){
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;		
	}
	
	public String open(String name){//파라미터를 통해 외부에서 값을 받음[지역변수를 받음]
		return String.format(
				"은  행  명 : %s\n "
				+ "계좌 번호 : %s\n"
				+ "이       름 : %s\n"
				+ "개  설  일 : %s\n"
				+ "금       액 : %d\n",BANK_NAME,accountNum,name,today,money);
	}
}
