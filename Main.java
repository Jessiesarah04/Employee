import java.util.Scanner;

class Employee{
 String name;
 String joiningDate;
 int deptId;

public Employee(String name, String joiningDate, int deptId) {
    this.name = name;
    this.joiningDate = joiningDate;
    this.deptId = deptId;
}
public String getName() {
    return name;
}

public String getJoiningDate() {
    return joiningDate;
}

public int getDeptId() {
    return deptId;
}
}

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter department ID:");
    int deptId = scanner.nextInt();
    scanner.nextLine(); 
    System.out.println("Enter department name:");
    String deptName = scanner.nextLine();

    Department department = new Department(deptId, deptName);

    System.out.println("Enter employee name:");
    String empName = scanner.nextLine();
    System.out.println("Enter employee joining date (YYYY-MM-DD):");
    String joiningDate = scanner.nextLine();
    String joiningdate =null;
    System.out.println("Enter employee department ID:");
    int empDeptId = scanner.nextInt();

    Employee employee = new Employee(empName, joiningDate, empDeptId);

    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Joining Date: " + employee.getJoiningDate());
    System.out.println("Department ID: " + employee.getDeptId());
    
   scanner.close();
}
 
}
    