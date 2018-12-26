package gms21;

public class SubjectBean {
	private String subjName,profName;
	private int score;

	public String getSubjName(){
		return subjName;
	}
	public void setSubjName(String subjName){
		this.subjName = subjName;
	}
	public String getProfName(){
		return profName;
	}
	public void setprofName(String profName){
		this.profName = profName;
	}
	public int getScore(){
		return score;
	}
	public void setscore(int score){
		this.score = score;
	}
	public String toString(){
			return String.format("[과목정보]\n 1.과목명:\n 2.교수명:\n 3.점수:\n ",subjName,profName,score);
	}
}
