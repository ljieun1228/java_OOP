package tv;

public class TVbean {
	private String brand,color;
	private boolean power;
	private int channel,price;

	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean getPower(){
		return power;
	}
	public void setPower(boolean power){
		this.power = power; 
	}
	public int getChannel(){
		return channel;
	}
	public void setChannel(int channel){
		this.channel =channel;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String toString(String brand,String color,int price) {
		return String.format("브랜드:%s 색상:%s 가격:%d", brand,color,price);
	}


}
