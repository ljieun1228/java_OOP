package real;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Parser;

public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog(
					"0.종료\n "
							+ "1.회원관리 \n"
							+ "2.계산기 \n"
							+ "3.로또 \n"
							+ "4.달력 \n");
			switch(menu) {
			case "0":
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1":
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null,
						String.format("환영합니다 %s 님", m.name));

				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n"
						+ "1. BMI(키, 몸무게) \n"
						+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n"
						+ "3. 성별체크(SSN)");
				switch (mMenu) {
				case "1":
					String[] arr = JOptionPane.showInputDialog(null,"키,몸무게 입력").split(",");
					String bmi = m.bmi(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]));
					JOptionPane.showMessageDialog(null,
							String.format("%s 님은 %s 입니다.", m.name,	bmi));					
					break;
				case "2":
					String arr1 = JOptionPane.showInputDialog(null,"국어,영어,수학,과학,사회 성적 입력");
					String[] scoreArr = arr1.split(",");
					String grade = m.grade(scoreArr);
					JOptionPane.showMessageDialog(null, String.format("%s는 %s 학점 입니다.",m.name,grade));
					break;
				case "3":
					String Ssn = JOptionPane.showInputDialog(null,"주민번호를 입력하세요.\n 9000000-1234567");
					String checker = m.genderChecker(Ssn);
					JOptionPane.showMessageDialog(null, checker);
					break;
				default:
					break;
				}
			case "2":
				Calc c = new Calc();
				String cMenu = JOptionPane.showInputDialog("[환영합니다.] \n"
						+ "1. 계산기 \n"
						+ "2. 구구단 \n");
				
				switch (cMenu) {
				case "1":
					String res1 = JOptionPane.showInputDialog(null,"계산기입니다.");
					String [] op = res1.split("");
					String res = c.calc(op);
					JOptionPane.showMessageDialog(null, res);
					break;

				default:
					break;
				}
				
				
			}
		}
	}
}