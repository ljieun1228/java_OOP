package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member mem = null;

		while(true){
			switch (JOptionPane.showInputDialog("메뉴\n 0. 종        료\n "
					+ "1. 회원가입\n "
					+ "2. 계좌개설\n "
					+ "3. 계좌조회\n "
					+ "4. 입        금\n "
					+ "5. 출        금\n "
					+ "6. 비번변경\n "
					+ "7. 회원조회")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("아이디입력");
				String name =JOptionPane.showInputDialog("이름입력");
				String ssn =JOptionPane.showInputDialog("주민번호입력");
				String pw =JOptionPane.showInputDialog("비번입력");
				mem = new Member(id, name, ssn, pw);
				String info = mem.toString();
				JOptionPane.showMessageDialog(null, info);
				break;
			case "2" :
				account = new Account(0);
				break;
			case "3" :
				String open = account.toString();
				JOptionPane.showMessageDialog(null, open);
				break;
			case "4" :
				int withdon = Integer.parseInt(JOptionPane.showInputDialog("입금액"));
				JOptionPane.showMessageDialog(null, account.withdraw(withdon));	
				break;
			case "5" :
				int depodon = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
				JOptionPane.showMessageDialog(null, account.deposit(depodon));	
				break;
			case "6" : 
				String changePw = JOptionPane.showInputDialog("변경할 비밀번호를 입력하세요.");
				JOptionPane.showMessageDialog(null,mem.PassAble(changePw));
				break;
			case "7":
				JOptionPane.showMessageDialog(null, mem.toString());
				break;
			default:
				break;
			}
		}
	}
}
