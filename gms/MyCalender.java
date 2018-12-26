package gms;

public class MyCalender {
	public String leapYear(String year1) {
		String res = "";
		int a = Integer.parseInt(year1);
		
		if(a % 4 ==0 && a % 100 !=0 ||a % 400 == 0  ) {
			res = "윤년";
		}else {
			res ="평년";
		}
		return res;
	}
}