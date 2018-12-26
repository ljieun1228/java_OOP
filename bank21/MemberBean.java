package bank21;

public class MemberBean {
	private String id,name,ssn,pass;
	// 디폴트 생성자는 존재한다.
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {// getter 게터
		return name; // read
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		return String.format("[회원정보]\n"
					+ "ID: %s\n"
					+ "이름: %s\n"
					+ "주민번호: %s\n"
					+ "비밀번호: %s", id,name,ssn, pass );
	}
	
}
