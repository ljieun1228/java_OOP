package bank31;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다

	/**
	 * CREATE
	 */
	public void createAccount();

	public String makeAccountNum();

	/**
	 * READ
	 */
	public AccountBean[] findAll();

	public AccountBean[] findByMemberId(String id);

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccountNum(String accountNum);

	public String info(String accountNum, String name, String today, int money); // 계좌정보 보여주기

	public String findToday(); // 오늘 날짜 구하기

	/**
	 * UPDATE
	 */
	public String withdrawMoney(int money); // 출금하기

	public String depositMoney(int money); // 입금하기

	/**
	 * DELETE
	 */
	public void deleteAccountNum();

}
