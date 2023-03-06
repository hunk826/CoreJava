package CoreJava;

class GraduateStudent extends Student1
{
	private String advisor;
	private String thesisTopic;
	
	//constructor
	public GraduateStudent(String name, int age, String studentID, String major, String advisor, String thesisTopic) {
		super(name, age, studentID, major);
		this.advisor = advisor;
		this.thesisTopic = thesisTopic;
	}
	//getters and setters

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesisTopic() {
		return thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	
	
	
	
	
}
