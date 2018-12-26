package bank;

public class Member {
	String id,name,ssn,pass;//전역변수=멤버변수

	Member(String id, String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}

	public String info(){
		String info = "";
		return String.format("[회원정보]\n"
				+ "ID: %s\n"
				+ "이름: %s\n"
				+ "주민번호: %s\n"
				+ "비밀번호: %s\n",id, pass, name, ssn);
	}
}
