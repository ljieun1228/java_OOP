package gms21;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		StudentBean stu = null;
		SubjectBean sub = null;
		SubjectService subjectService = new SubjectService();
		while(true){
			/*성적표에 표시 될 내용: 
			학번(Student)hakbun
			학생이름(Student)name
			과목명(Subject)
			점수(Subjact)
			*/
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.학생부등록 2.학생정보보기 3.수강과목등록 4.교수등록 5.비번변경 "
					+ "6.점수등록 7.성적표보기"))
			{
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "1":
				stu = new StudentBean();
				String name = JOptionPane.showInputDialog("이름입력");
				String ssn = JOptionPane.showInputDialog("주민번호입력");
				String pass = JOptionPane.showInputDialog("비밀번호입력");
				stu.setName(name);
				stu.setSsn(ssn);
				stu.setPass(pass);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, stu.toString());
				break;
			case "3":
				String subjName = JOptionPane.showInputDialog("수강과목등록");
				sub = new SubjectBean();
				sub.setSubjName(subjName);
				break;
			case "4":
				String profName = JOptionPane.showInputDialog("교수등록");
				sub.setSubjName(profName);
				break;
			case "5" :
				String passChange = JOptionPane.showInputDialog("변경할 비밀번호를 입력하세요.");
				stu.setPass(passChange);
				break;	
			case "6":
				String score = JOptionPane.showInputDialog("수강과목점수를 입력하세요");
				sub.setscore(Integer.parseInt(score));
				break;
			case "7":
				String record = subjectService.showRecord(
						stu.getHakbun(),
						stu.getName(),
						sub.getSubjName(),
						sub.getScore());
				JOptionPane.showMessageDialog(null,record);
				break;
			default:
				break;
			}
		}
		
	}

}
