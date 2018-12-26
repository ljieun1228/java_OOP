package phone;

public class AndroidPhoneBean extends IPhoneBean {
	private String display;

	public String getDisplay(){
		return display;
	}
	public void setDisplay(String display){
		this.display = display;
	}
	
	@Override
	public String toString() {
		return String.format("종류:%s\n 제조사:%s\n 이동가능성:%s\n 큰화면:%s\n 검색:%s\n ", 
				getkind(),getcompany(),getMove(),display,getData());
}
}