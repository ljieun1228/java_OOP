package gms2;

public class Student {
	String hakbun, name, ssn, pass;
	
	Student(String hakbun,String name,String ssn,String pass){
		this.hakbun = hakbun;
		this.name = name;
		this.ssn = ssn;
		this.pass =  pass;
	}
	public String info(){
		String info = " ";
		return String.format("학번 :%s 이름:%s 주민번호:%s 비밀번호:%s", hakbun,name,ssn,pass);
	}
}
