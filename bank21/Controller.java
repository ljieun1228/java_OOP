package bank21;

import javax.swing.JOptionPane;

public class Controller {
	
	public static void main(String[] args) {
		AccountBean account = null;
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService service = new AccountService();
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌개설 3.계좌보기 4.입금 5.출금 6.비번변경 7.회원정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String id = JOptionPane.showInputDialog("ID등록");
					String name = JOptionPane.showInputDialog("이름 등록");
					String ssn = JOptionPane.showInputDialog("주민번호 등록");
					String pass = JOptionPane.showInputDialog("비번 등록");
					memberService.join(id,name,ssn,pass);
					
					break;
				case "2":
					account = new AccountBean();
					String accountNum = service.makeAccountNum();
					account.setAccountNum(accountNum);
					String today = service.makeToday();
					account.setToday(today);
					String sMoney = JOptionPane.showInputDialog("입금");
					int iMoney = Integer.parseInt(sMoney);
					account.setMoney(iMoney);
					String info2 = service.info(
							account.getAccountNum(),
							member.getName(), 
							account.getToday(), 
							account.getMoney());
					//파라미터와 아규먼트는 타입과 개수가 일치해야한다.
					JOptionPane.showMessageDialog(null, info2);
					break;
				case "3":
					String open = account.toString();
					JOptionPane.showMessageDialog(null,open);
					break;
				case "4":
					String inputMoney = JOptionPane.showInputDialog("입금액");
					//String message = account.deposit(Integer.parseInt(inputMoney));
					//JOptionPane.showMessageDialog(null, message);
					break;
				case "5":
					String outputMoney = JOptionPane.showInputDialog("출금액");
					//String message2 = account.withdraw(Integer.parseInt(outputMoney));
					//JOptionPane.showMessageDialog(null, message2);
					break;
				case "6":
					String changePass = JOptionPane.showInputDialog("바꿀 비번 입력");
					member.setPass(changePass);
					break;
				case "7":
					JOptionPane.showMessageDialog(null,member.toString() );
					break;
			}
		}
	}
}






