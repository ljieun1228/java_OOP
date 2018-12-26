package gms21;

import java.util.Random;

public class StudentService {

	public String hakbungen(){
		String hakbun11 = "";
		Random ran = new Random();
		for (int i = 0; i < 4; i++) {
			hakbun11 += ran.nextInt(10);
		}
		return hakbun11;
	}
}

