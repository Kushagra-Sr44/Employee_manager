package EmployeeDataAnalyze;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.addEmployee(new  Employee(1,"nhs","kjd",1240));
        employeeManager.addEmployee(new Employee(5, "sdjk", "jksd", 45));
        Thread pro1=new EmployeeProcessor( 1,employeeManager);
         Thread pro2=new EmployeeProcessor( 5,employeeManager);
          Thread pro3=new EmployeeProcessor( 78,employeeManager);
          pro1.start();
          pro2.start();
          pro3.start();
          try {
            pro1.join();
            pro2.join();
            pro3.join();
          }
          catch(Exception e){
            System.out.println("Wating fot threa competion"+e.getMessage());
          }
          List<Employee> ln=employeeManager.filteerEmployeebysalary(2);
           ln.forEach(System.out::println);
          List<Employee> li=employeeManager.sortEmployeebysalary();
          li.forEach(System.out::println);
    }
}
