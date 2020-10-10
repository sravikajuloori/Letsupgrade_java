public class ObjectCreation
{
	public static void main(String[] args) {
	    Employee e1=new Employee();
		e1.display("Twyla",28,"Delhi");
		System.out.println("----------------------");



		Employee e2=new Employee();
		e2.display("Barney",34,"Banglore");
	}
}
class Employee{
    String name=new String();
    int age;
    String city=new String();
    
    public void display(String name,int age,String city){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
}

/* output:

The name is Twyla
The age is 28
The city is Delhi
----------------------
The name is Barney
The age is 34
The city is Banglore

*/