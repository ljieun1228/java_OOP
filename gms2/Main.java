package gms2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		while(true){
			switch (JOptionPane.showInputDialog("메뉴 0.종료 1.회원정보 2.시험결과")){
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "1":
				String hakbun = JOptionPane.showInputDialog("학번입력");
				String name = JOptionPane.showInputDialog("이름입력");
				String ssn = JOptionPane.showInputDialog("주민번호입력");
				String pass = JOptionPane.showInputDialog("비밀번호입력");
				
				Student stu = new Student(hakbun, name, ssn, pass);
				String student = stu.info();
				JOptionPane.showMessageDialog(null, student);
				break;
			default:
				break;
			}
		}
		
	}

}
