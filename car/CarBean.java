package car;

public class CarBean {
	private String brand, color, gearType;
	private int door; // 문의 갯수
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getcolor(){
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String getGearType(){
		return gearType;
	}
	public void setGearType(String gearType){
		this.gearType = gearType;
	}
	public int getdoor(){
		return door;
	}
	public void setDoor(int door){
		this.door = door;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[차량정보]색깔:\n기어타입:\n문의갯수\n",color,gearType,door);
	}
}