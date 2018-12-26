package car;

import javax.swing.JOptionPane;

public class CarController {
	public static void main(String[] args) {
		CarBean carBean = null;
		CarService carService = new CarServiceImpl();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료\n "
					+ "1.차량입고\n"
					+ " 2.차량목록\n"
					+ " 3.차량검색\n"
					+ " 4.차량판매")) {
					case "0":			
						return;
					case "1":		
						carBean = carService.add(
						JOptionPane.showInputDialog("브랜드"),
						JOptionPane.showInputDialog("색상"),
						JOptionPane.showInputDialog("기어타입"),
						Integer.parseInt(JOptionPane.showInputDialog("문의갯수")));
						break;
					case "2":
						carService.list();
						break;
					case "3":
						carService.find();
						break;
					case "4":
						carService.sell();
						break;
					default:
						break;
			}
		}
	}
}