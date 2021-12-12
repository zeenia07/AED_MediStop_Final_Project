/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Employee;

import java.util.ArrayList;

/**
 *
 * @author Zeenia
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeDirectory() 
    {
        return employeeDirectory;
    }
    
    public Employee addEmployee(String empName)
    {
        Employee employee = new Employee();
        employee.setEmployeeName(empName);
        employeeDirectory.add(employee);
        return employee;
    }  
}
