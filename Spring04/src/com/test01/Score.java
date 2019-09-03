package com.test01;

public class Score {
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String grade;
	
	public Score() {}
	
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public Score(String name, int no, int kor, int eng, int math, int sum, double avg, String grade) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
		this.grade = grade;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setSum() {
		this.sum = kor + eng + math;
	}
	
	public void setAvg() {
		this.avg = (double)sum/3;
	}
	
	public void setGrade() {
		
		int res = (int)avg/10;
		
		switch (res) {
		case 10:
		case 9:
			this.grade = "A";
			break;
		case 8:
			this.grade = "B";
			break;
		case 7:
			this.grade = "C";
			break;
		case 6:
			this.grade = "D";
			break;
		default:
			this.grade = "F";
			break;
		}
	}
	
	public String toString() {
		setSum();
		setAvg();
		setGrade();
		
		return "이름 : "+ name +"\t국어 : "+kor+"\t영어 : "+eng+ "\t수학 : "+math+ "\t합계 : "+ sum+ "\t평균 : "+ avg + "\t등급 : "+grade;
	}
	

}
