package EmployeeDataAnalyze;
import java.util.*;
import java.util.Optional;

public class Employee {
    private String name;
    private int id;
    private String dept;
    private double salary;
    public Employee(int id,String name,String dept ,double salary){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public int getId(){
return id;

    }
     public String getName(){
return name;

    } public String getdept(){
return dept;

    } public Optional<Double> getSalary(){
return Optional.ofNullable(salary);

    }  
@Override
public String toString(){
    return "Employee{id="+id+",name="+name+",department="+dept+",Salary="+salary+"}";
}
}
