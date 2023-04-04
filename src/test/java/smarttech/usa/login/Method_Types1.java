package smarttech.usa.login;

public class Method_Types1 {

// To create the void method, void : return nothing
// signature name.() {} then as of I mention write void must  before signature name, public is not mandatory. For use anywhere we have to use the public.
// Void method does not need data type.	
     	public void getEmployee () {
	
	
	}
// To create the return method/ non-void method: return something
// for handling salary we use int
// Name,(),{} then it comes error but we have to bring return statement.
	public int getSalary() {
		return 0;
	
    
    	 
     }
	
// By default String return value is null
	public String getname() {
		return null;
		
		
	}
// The difference between void and return method is
// Void method do not have return keyword
// Data type method we have return keyword.It's return at least 0 by default

// parameterized method
// Inside the parameter we have to write any argument/data type
// there is no restriction to put the data inside the ()
	public void employeeInfo(int salary, int bonus){
		
	}   // void parameterized method
	
	public int workersInfo(int salary, int bonus) {
		return bonus;   //non-parameterized/ return parameterized method method
	}
// Static method has different kind.such as
	
    public static void getEmployeeInfo() {
    	
   }    // static Void  method

	public static int bringSalary(){
		return 0;       //static return /static non-void  method
		}
	   
	public static void salaryInfo(int salary, int commission) {
		
	}     //static void parameterized method
	
     public static int totalEmployeeinfo(int salary, int bonus, int commission){
     
	return commission;
        //static return/non-parameterized method


	 // To find the value
	 //*public static void getEmployeeInfo() {
		 //**System.out.println("Haya");
		
	}  
	//* public static int getSalary() {
			//return 10000;
		 }	
	 
	

	
	 
	 
	
	
		
	
	
		
	





