package bank31;

public interface MemberService {
	/**
	 * CREATE
	 */
	public void create(String id, String name, String pass, String ssn);

	/**
	 * READ
	 */

	public MemberBean[] findAllMember();

	public MemberBean[] findByMemberName(String name);

	public MemberBean findById(String id);

	public boolean existId(String id);

	public boolean existMember(String id, String pw);

	public int countMember();

	/**
	 * UPDATE
	 */
	public void updatePassWord(String id, String pw, String newPass);

	/**
	 * DELETE
	 */
	public void deleteMember(String id, String pw);
}
