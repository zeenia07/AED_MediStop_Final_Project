/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Employee;

/**
 *
 * @author Zeenia
 */
public class Employee {
    private String employeeName;
    private int empId;
    private static int count = 1;

    public Employee() 
    {
        empId = count;
        count++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return employeeName; //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
    
}
