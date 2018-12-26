package bank31;

/*
추가 Create      - set - void 
목록 list - Read - get - Object
검색 find - Read - get - Object
수정 Update      - set - void 
삭제 Delete      - set - void
 * */
public class MemberServiceImpl implements MemberService {

	private MemberBean[] members;
	private int count;

	MemberServiceImpl() {
		this.members = new MemberBean[10];
		this.count = 0;
	}

	/**
	 * CREATE
	 */
	@Override
	public void create(String id, String name, String pass, String ssn) {
		MemberBean member = new MemberBean();

		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;
	}

	/**
	 * READ
	 */
	@Override
	public MemberBean[] findAllMember() {
		return members;
	}

	@Override
	public MemberBean[] findByMemberName(String name){
		return members;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean existMember(String id, String pw) {
		boolean ok = false;
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pw)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	
	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countMember() {
		return count;
	}

	/**
	 * UPDATE
	 */
	@Override
	public void updatePassWord(String id, String pw, String newPass) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pw)) {
				member = members[i];
				member.setPass(newPass);
				break;
			}
		}
	}

	/**
	 * DELETE
	 */
	@Override
	public void deleteMember(String id, String pw) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pw)) {
				members[i] = null;
				break;
			}
		}
	}


}
