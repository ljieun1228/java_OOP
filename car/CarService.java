package car;

public interface CarService {
	/**
	 * 판매할 차량의 입고
	 * */
	public CarBean add(String brand, String color, String gearType, int door);
	/**
	 * 판매할 차량의 목록
	 * */
	public void list();
	/**
	 * 판매할 차량 검색
	 * */
	public void find();
	/**
	 * 차량의 판매
	 * */
	public void sell();
}
