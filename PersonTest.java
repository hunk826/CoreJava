package CoreJava;



public class PersonTest {

	public static void main(String[] args) 
	{
		Person p = new Person("Anju", 30);
		System.out.println("Person: " + p.getName() + ", " + p.getAge());

		Student1 s = new Student1("Baskar", 20, "12345", "Computer Science");
		System.out.println("Student: " + s.getName() + ", " + s.getAge() + ", " + s.getStudentID() + ", " + s.getMajor());

		GraduateStudent g = new GraduateStudent("Charlie", 25, "54321", "Mathematics", "Dr. Smith", "Group Theory");
		System.out.println("Graduate Student: " + g.getName() + ", " + g.getAge() + ", " + g.getStudentID() + ", " + g.getMajor() + ", " + g.getAdvisor() + ", " + g.getThesisTopic());


	}

}
