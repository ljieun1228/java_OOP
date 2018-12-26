package gms;

import java.util.Scanner;

public class Member {
	String name; // 멤버변수

	public String bmi(double t,double w) {
		String bmi = "";
		double bmi2 = w/(t*t)*1000;
		if(bmi2>=40) {
			bmi ="고도비만";
		}else if(bmi2>=35) {
			bmi = "중등도 비만";
		}else if(bmi2>=30) {
			bmi = "경도 비만";
		}else if(bmi2>=25) {
			bmi = "과체중";
		}else if(bmi2>=18.5) {
			bmi = "정상";
		}else{
			bmi = "저체중";

		}
		return bmi;
	} // bmi end
	public String grade(String[] scoreArr) {

		int a = Integer.parseInt(scoreArr[0]);
		int b = Integer.parseInt(scoreArr[1]);
		int c = Integer.parseInt(scoreArr[2]);
		int d = Integer.parseInt(scoreArr[3]);
		int e = Integer.parseInt(scoreArr[4]);
		String grade=""; 
		int avg = (a+b+c+d+e)/5;

		if(avg>=100){
			grade = "A";
		}else if(avg>=90){
			grade = "B";
		}else if(avg>=80){
			grade = "C";
		}else if(avg>=70){
			grade = "D";
		}else if(avg>=60){
			grade = "E";
		}else{
			grade = "F";
		}

		// 로컬변수는 반드시 초기화 해야 한다.원치않는 값이 할당됨.
		/*
		국어, 영어, 수학, 과학, 사회 과목 점수를 입력 받아서 평균을 낸뒤
		100 ~ 90 A, B, C, D, E, F 를 내는 것
		 * */
		return grade;
	}
	public String genderChecker(String Ssn) {


		String checker = "";

		char ch = Ssn.charAt(7);

		if(ch=='1'||ch=='3'){
			checker = "남자요.";
		}else if(ch=='2'||ch=='4'){
			checker = "여자요.";
		}else if(ch=='5'||ch=='6'){
			checker = "외국인이요.";
		}else {
			checker = "다시 입력하세요.";}

		return checker;
	}
}