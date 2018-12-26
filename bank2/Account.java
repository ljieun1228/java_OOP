package bank2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * 계좌 클래스
 * [속성]
 * 상수 : BANK_NAME
 * 멤버변수 :  
 * 1. accountNum 계좌번호
 * 2. money 잔액
 * 3. today 해당일
 * [기능]
 * 1. generatorAccountNum() 계좌번호생성(랜덤)
 * 2. today() 해당일생성
 * 3. withdraw() 출금하기
 * 4. deposit() 입금하기
 * 5. info() 계좌정보
 * */

public class Account {
	public final static String BANK_NAME = "지은은행"; // public
	private String accountNum, today; //멤버변수 private
	private int money;

	Account(int money){
		this.accountNum = generatorAccountNum();
		this.today = today();
		this.money = money;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public String getToday(){
		return today;
	}
	public int getMoney(){
		return money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	
	public String generatorAccountNum(){
		String accountNum = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if(i==3){
				accountNum+=random.nextInt(10)+"-";
			}else{
				accountNum+=random.nextInt(10);
			}
		}
		return accountNum;
	}	
	public String today(){
		String today = "";
		Date date = new Date();
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		today = date2.format(date);
		return today;
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
		if(money > 0 && this.money>=money) {
			this.money -= money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었거나 잔고가 부족합니다";
		}
		return message;
	}
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message = "";
		if(money > 0) {
			this.money += money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었습니다";
		}
		return message;
	}


		public String toString(String name){
			return String.format(
					"은  행  명 : %s\n "
							+ "계좌 번호 : %s\n"
							+ "이       름 : %s\n"
							+ "개  설  일 : %s\n"
							+ "금       액 : %d\n",BANK_NAME,accountNum,today,money);
		}
	}
