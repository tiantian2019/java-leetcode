package CompareTest;


public class StudentClass implements Comparable<StudentClass>{
	private String classNo;
	private String name;
	private String score;
	
	public StudentClass() {
		
	}

	public StudentClass(String classNo, String name, String score) {
		this.classNo = classNo;
		this.name = name;
		this.score = score;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return classNo+"-->"+name+"-->"+score+".";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((StudentClass)obj).name);
	}

	@Override
	public int compareTo(StudentClass o) {
		
		return Integer.parseInt(this.score) - Integer.parseInt(o.score);
	}

	
}
