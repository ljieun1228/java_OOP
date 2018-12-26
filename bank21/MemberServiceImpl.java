package bank21;

public class MemberServiceImpl implements MemberService {
	// 회원가입
	public void join(String id,String name,String ssn,String pass) {
		MemberBean memberBean = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setPass(pass);
		memberBean.setSsn(ssn);
	
	}
	// 로그인
	public void login() {}
	// 정보 수정
	public void update() {}
	// 회원탈퇴
	public void delete() {}
}
