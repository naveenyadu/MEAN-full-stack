

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int empId;
    private String empName;
    private int empSalary;
    private String empDept;

    public Employee(int empId, String empName, int empSalary, String empDept) {
       
        this.empId = empId;
        this.empName = empName;
        this.empSalary=empSalary;
        this.empDept=empDept;
    }

   
    public int getEmpId() {
        return empId;
    }

   
    public void setEmpId(int empId) {
        this.empId = empId;
    }

   
    public String getEmpName() {
        return empName;
    }

   
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int getEmpSalary() {
        return empSalary;
    }
    
    public String getEmpDept() {
        return empDept;
    }
    
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    
    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }
    



   
    public String toString() {
        return "\nEmployee Id=" + empId + ",\nEmployee Name=" + empName + ", "
        		+ "\nEmployee Salary=" + empSalary + ","
        				+ "\nEmployee Department=" + empDept + "\n ";
    }

  
    public int hashCode() {
        return this.empId;
    }

  
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if (employee.empId == this.empId) {
            employee.setEmpName(this.empName);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Raj", 50000,"IT"));
        employees.add(new Employee(4, "Pradeep",45000,"Business"));
        employees.add(new Employee(3, "Kumar",40000,"IT"));
        employees.add(new Employee(2, "Chandan",65000,"Business"));
        employees.add(new Employee(4, "Amitava",55000,"IT"));
        
        System.out.println(employees);
    }
}