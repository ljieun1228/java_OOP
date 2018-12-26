package card;

public class CardBean {
	private String kind; // 카드종류: 스페이드,다이아, 하트, 클로버
	private int number;
	
	public String getKind(){
		return kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}

