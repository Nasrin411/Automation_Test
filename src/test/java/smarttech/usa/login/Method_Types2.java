package smarttech.usa.login;

public class Method_Types2 {
 
	public void getEmployee() {
		System.out.println("Haya");
	}
	public static int getSalary() {
		return 10000;
		
	}
	public void getEmployee(int salary, int commission) {
		salary = 10000;
		commission = 2000;
		System.out.println(salary+commission);
		
	}// this code do not run because it does not have main method. java can not run without main method
	
	// To create the main method: write main then control space
	//*public static void main(String[] args) {
		
//*	}
	// then how to call void method inside the main method
	//first create the object
	// by class name we can create an object
	// object created by the class name, object name = new class name ();
	// Inside the main method we have to create the object
	// then by object name we can call the void method
	public static void main(String[] args) {
		 Method_Types2 obj = new Method_Types2();
		 obj.getEmployee();
	}
	// How to call static method
	// by call name
}
		 
	
	
	
	
	


