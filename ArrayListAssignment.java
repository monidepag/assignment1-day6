import java.util.ArrayList;
import java.util.Scanner;

class employee {
    int employeeId;
    String employeeName;
    double salary;
	public employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class ArrayListAssignment {

    ArrayList<employee> emp;

    ArrayListAssignment()
    {
        this.emp = new ArrayList<employee>();
    }

    void insert(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();
        employee e = new employee(id, name, salary);
        emp.add(e);
        System.out.println("Added successfully.");
    }

    void display(Scanner sc)
    {
        for(employee e : emp)
	{
	    System.out.println("Employee ID : " + e.getEmployeeId());
            System.out.println("Employee Name : " + e.getEmployeeName());
            System.out.println("Salary : " + e.getSalary());
	}
    }

    void search(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(employee e : emp)
        {
            if(e.getEmployeeId() == id)
            {
                System.out.println("Employee ID : " + e.getEmployeeId());
            	System.out.println("Employee Name : " + e.getEmployeeName());
            	System.out.println("Salary : " + e.getSalary());
                return;
            }
        }
        System.out.println("Id not found.");
    }

    void delete(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(employee e : emp)
        {
            if(e.getEmployeeId() == id)
            {
                emp.remove(e);
                System.out.println("Deleted successfully.");
                return;
            }
        }
        System.out.println("Id not found.");
    }

    void update(Scanner sc)
    {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        for(employee e : emp)
        {
            if(e.getEmployeeId() == id)
            {
                System.out.println("Enter Name : ");
                e.setEmployeeName(sc.next());
                System.out.println("Enter Salary : ");
                e.setSalary(sc.nextDouble());
                System.out.println("Updated Successfully.");
                return;
            }
        }
        System.out.println("Id not found.");
    }

    public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
        ArrayListAssignment a = new ArrayListAssignment();
		while(true) {
		System.out.println("1. Insert");
		System.out.println("2. Display");
		System.out.println("3. Search");
		System.out.println("4. Delete");
		System.out.println("5. Update");
        System.out.println("6. Exit");
		System.out.print("Enter your choice : ");
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: a.insert(sc);
				break;
		case 2: a.display(sc);
			    break;
		case 3: a.search(sc);
                break;
		case 4: a.delete(sc);
                break;
		case 5: a.update(sc);
                break;
        case 6: System.out.println("Thank you for using the application. Exiting...");
                return;
        default: System.out.println("You entered an invalid choice.");
                 break;
		
		}

	}
}
}
