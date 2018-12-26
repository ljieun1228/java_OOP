package phone;

public class CelPhoneBean extends PhoneBean {//폰빈에서 확장하여 셀폰빈만듬
	private String move;
	
	public String getMove(){
		return move;
	}
	public void setMove(String move){
		this.move = move;
	}
	@Override
	public String toString() {

		return String.format("종류:%s\n "
				+ "제조사:%s\n "
				+ "통화내역:%s\n "
				+ "이동가능:%s",
				super.getkind(),
				super.getcompany(),
				super.getcall(),
				move); //super은 생략 가능 super에서 확장하여 사용했음.  
	}
}
