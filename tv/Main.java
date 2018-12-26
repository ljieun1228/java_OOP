package tv;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		TVbean tvbean = null;
		while(true){
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.TV구매 2.TV정보보기 3.TV작동 "))
			{
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "1":
				String brand = JOptionPane.showInputDialog("회사명");
				String color = JOptionPane.showInputDialog("색상");
				int price = Integer.parseInt(JOptionPane.showInputDialog("가격"));
				tvbean = new TVbean();
				tvbean.setBrand(brand);
				tvbean.setColor(color);
				tvbean.setPrice(price);
				break;
			case "2": 
				JOptionPane.showMessageDialog(null, tvbean.toString());
				break;
			case "3":
				
				break;
			default:
				break;
			}
		}
	}
}
