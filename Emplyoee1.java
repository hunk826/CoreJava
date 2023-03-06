package CoreJava;

//Creating Class Emplyoee1
class Emplyoee1 
{
	 private String name;
	   private  int id;
	    private double salary;
	    
		public Emplyoee1(String name, int id, double salary) {
			super();
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
	    
		void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: $" + salary);
	    }
	    
}
class Manager1 extends Emplyoee1 
{
    private String department;

	public Manager1(String name, int id, double salary, String department) {
		super(name, id, salary);
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}

    
}
class Clerk1 extends Emplyoee1 
{
	private int hoursWorked;

	public Clerk1(String name, int id, double salary, int hoursWorked) {
		super(name, id, salary);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "Clerk [hoursWorked=" + hoursWorked + "]";
	}
	
	
}
class Test1
{
	public static void main(String[] args)
	{
		Manager1 manager = new Manager1("John Smith", 1001, 50000.0, "Sales");
        Clerk1 clerk = new Clerk1("Jane Doe", 2001, 25000.0, 40);
        manager.displayDetails();
        clerk.displayDetails();
	}
}