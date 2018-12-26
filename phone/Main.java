package phone;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhoneBean = null;
		IPhoneBean iPhoneBean = null;
		AndroidPhoneBean aPhone = null;
		while(true){
			switch (JOptionPane.showInputDialog("메뉴\n "
					+ "0. 종        료\n "
					+ "1. 일반전화\n "+ "2. 휴대전화 \n "	+ "3. 아이폰\n "
					+ "4. 갤럭시 \n "+ "5. \n "+ "6. \n "+ "7. ")) {
					case "0":
						JOptionPane.showMessageDialog(null, "종료");
						return;
					case "1":
						//종류: 일반전화기
						//제조사: 금성
						//통화내용:안녕 
						phone = new PhoneBean();
						String kind = JOptionPane.showInputDialog("전화기 종류");
						String company = JOptionPane.showInputDialog("어느 회사 제품");
						String call = JOptionPane.showInputDialog("통화내용");
						phone.setkind(kind);
						phone.setcompany(company);
						phone.setcall(call);
						JOptionPane.showMessageDialog(null,phone.toString());
						break;
					case "2":
						//종류: 휴대전화
						//제조사: 모토로라
						//통화내용:안녕
						//이동가능성 : 가능
						phone = new PhoneBean();
						celPhoneBean = new CelPhoneBean();
						kind = JOptionPane.showInputDialog("전화기 종류");
						company = JOptionPane.showInputDialog("어느 회사 제품");
						call = JOptionPane.showInputDialog("통화내용");
						String move = JOptionPane.showInputDialog("이동가능성");
						celPhoneBean.setkind(kind);
						celPhoneBean.setcompany(company);
						celPhoneBean.setcall(call);
						celPhoneBean.setMove(move);
						JOptionPane.showMessageDialog(null, celPhoneBean.toString());
						break;
					case "3":
						//종류: 아이폰
						//제조사: 애플
						//이동가능성 : 가능
						//검색 : 노래
						iPhoneBean = new IPhoneBean();
						kind = JOptionPane.showInputDialog("전화기 종류");
						company = JOptionPane.showInputDialog("제조사");
						move = JOptionPane.showInputDialog("이동가능성");
						String data = JOptionPane.showInputDialog("검색");
						iPhoneBean.setkind(kind);
						iPhoneBean.setcompany(company);
						iPhoneBean.setMove(move);
						iPhoneBean.setData(data);
						JOptionPane.showMessageDialog(null, iPhoneBean.toString());
						break;
					case "4":
						//종류: 갤럭시
						//제조사: 삼성
						//이동가능성 : 가능
						//몇인치 : 6인치
						//검색 : 영화
						aPhone = new AndroidPhoneBean();
						kind = JOptionPane.showInputDialog("전화기 종류");
						company = JOptionPane.showInputDialog("제조사");
						move = JOptionPane.showInputDialog("이동가능성");
						String display = JOptionPane.showInputDialog("몇인치");
						data = JOptionPane.showInputDialog("검색");
						aPhone.setkind(kind);
						aPhone.setcompany(company);
						aPhone.setMove(move);
						aPhone.setDisplay(display);
						aPhone.setData(data);
						JOptionPane.showMessageDialog(null, aPhone.toString());
						break;
								
			}
		}
	}
}