package card;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardBean cardBean = null;
		CardService cardService = new CardServiceImpl();
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.카드배팅 2.")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String kind = JOptionPane.showInputDialog("카드종류");
					int number = Integer.parseInt(JOptionPane.showInputDialog("카드번호"));
					cardService.bet(kind, number);
					break;
				case "2":
					
					// 제출한 카드의 스펙
					break;
			}
		}
	}
}