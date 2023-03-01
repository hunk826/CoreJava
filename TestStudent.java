package CoreJava;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRoll(60);
		s1.setName("Hunk");
		s1.setAge(23);
		
		System.out.println("STUDENT DATA -> \n"+"Student ID: "+s1.getRoll()+"\n"+"Student Name: "+s1.getName()+"\n"+"Student Age: "+s1.getAge());

	}

}
