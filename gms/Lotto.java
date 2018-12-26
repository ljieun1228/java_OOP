package gms;

import java.util.Random;

public class Lotto {
	public String randomNum(){

		String num = "";
		Random ran = new Random();
		for (int i = 1; i < 31; i++) {
			num += (ran.nextInt(45)+1)+ " | ";
			if((i%6)== 0){
				num += "\n";
			}
		}
		return num;
	}
}
