package gms21;

public class SubjectService {
	/*성적표에 표시 될 내용: 
	학번(Student)hakbun
	학생이름(Student)name
	과목명(Subject)
	점수(Subjact)
	*/
	public String showRecord(
			String hakbun, 
			String name, 
			String subjName, 
			int score) {
		return String.format("학번:%s\n 이름:%s\n 과목명:%s\n 점수:%d\n", hakbun,name,subjName,score);
	}
}

