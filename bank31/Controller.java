package bank31;

import javax.swing.JOptionPane;

public class Controller {
	
	public static void main(String[] args) {
		AccountBean account = null;
		MemberBean member = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌개설 3.계좌보기 4.입금 5.출금 6.비번변경\n"
					+ "7.회원목록 8.회원검색 9.로그인 10.회원탈퇴")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1": // 회원가입
					memberService.create(
							JOptionPane.showInputDialog("ID등록"), 
							JOptionPane.showInputDialog("이름 등록"), 
							JOptionPane.showInputDialog("주민번호 등록"), 
							JOptionPane.showInputDialog("비번 등록")
							);
					break;
				case "2":
					account = new AccountBean();
					String accountNum = accountService.makeAccountNum();
					account.setAccountNum(accountNum);
					String today = accountService.findToday();
					account.setToday(today);
					String sMoney = JOptionPane.showInputDialog("입금");
					int iMoney = Integer.parseInt(sMoney);
					account.setMoney(iMoney);
					String info2 = accountService.info(
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
					String id = JOptionPane.showInputDialog("로그인 아이디 ");
					String pw = JOptionPane.showInputDialog("로그인 비번");
					String changePass = JOptionPane.showInputDialog("바꿀 비번 입력");
					memberService.updatePassWord(id,pw,changePass);
					break;

				case "7":
					MemberBean[] members = memberService.findAllMember();
					JOptionPane.showMessageDialog(null,members);
					break;
				case "8" :
					id = JOptionPane.showInputDialog("검색하실 아이디 입력하세요");
					JOptionPane.showMessageDialog(null,memberService.findById(id));
					break;
				case "9" :
					id = JOptionPane.showInputDialog("로그인 아이디 ");
					pw = JOptionPane.showInputDialog("로그인 비번");
					boolean ok = memberService.existMember(id,pw);
					if(ok) {
						JOptionPane.showMessageDialog(null,"로그인 성공" );
					}else {
						JOptionPane.showMessageDialog(null,"로그인 실패");
					}
					/*JOptionPane.showMessageDialog(null,(ok) ? "로그인 성공" : "로그인 실패");*/
					break;
				case "10":
					 id = JOptionPane.showInputDialog("삭제 할 아이디 ");
					 pw = JOptionPane.showInputDialog("삭제 할 비번");
				     memberService.deleteMember(id,pw);
					break;
			}
		}
	}
}






