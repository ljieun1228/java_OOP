package bank2;

public class Member {
	private String id,name,ssn,pass;//멤버변수=인스턴스변수를 선언 (1)
	
	public Member(String id,String name,String ssn,String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass; //생성자(파라미터)초기화 
	}//(3)
	
	/**
	 * 객체의 은닉화
	 * */
	
/*	public void setId(String id){
		this.id = id;
	}*/
	public String getId(){
		return this.id;
	}
/*	public void setName(String name){ //setter 새터 쓰기만 하는 곳 (void)
		this.name = name; //write
	}*/
	public String getName(){ //getter 개터 읽기만 하는 곳 
		return this.name; //read
	}
/*	public void setSsn(String ssn){
		this.ssn = ssn;                  수정불가하면 setter을 지운다.
	}*/
	public String getSsn(){
		return this.ssn;
	}
	
	public String PassAble(String pass){
		String aa11 = "";
		if(pass.equals(this.pass)){
			aa11 = "변경할 비밀번호가 기존의 비밀번호와 동일 합니다.";
		}else{
			this.pass = pass;
			aa11 = "비밀번호 변경에 성공하였습니다.";
		}
		return  aa11;
	}
	
	public void setPass(){
		this.pass = pass;
	}
	public String getPass(){
		return this.pass;
	}
	
	/**
	 * 회원정보 보여주기
	 **/
	public String toString( ){ //(2) //info->toString
		String toString = "";
		return String.format("아이디:%s 이름:%s 주민번호:%s 비밀번호:%s", id, name, ssn, pass);
	}	
}
