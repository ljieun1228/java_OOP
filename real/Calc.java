package real;

public class Calc{

	public String calc(String[] op) {

		String res = "";

		int a = Integer.parseInt(op[0]);
		String op1 = op[1];
		int b = Integer.parseInt(op[2]);

		switch(op1){
		case "+" : res = a+b+" ";
		break;
		case "-" : res = a-b+" ";
		break;
		case "/": res = a/b+" ";
		break;
		case "*": res = a*b+" ";
		break;
		default : break;
		}
		return res;
	}
	
	public String gugudan(int dan) {
		String res = "";
		return res;
	}
}


