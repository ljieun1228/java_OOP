package phone;
/**
 * company 제조사
 * call 전화
 * kind 종류
 * */

public class PhoneBean {
	
	private String kind, company, call;
	
	public String getkind(){
		return kind;
	}	
	public void setkind(String kind){
		this.kind = kind;
	}
	public String getcompany(){
		return company;
	}
	public void setcompany(String company){
		this.company = company;
	}
	public String getcall(){
		return call;
	}
	public void setcall(String call){
		this.call = call;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("종류:%s\n 제조사:%s\n 통화내역:%s\n",kind, company, call);
	}
}