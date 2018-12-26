package phone;

public class IPhoneBean extends CelPhoneBean{
	private String data;

	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data = data;
	}
	@Override
	public String toString() {
		return String.format("종류:%s\n 제조사:%s\n 이동가능성:%s\n 검색:%s\n", 
				getkind(),getcompany(),getMove(),data);
	}
}

