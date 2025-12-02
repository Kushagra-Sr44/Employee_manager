
package EmployeeDataAnalyze;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeManager {
HashMap<Integer,Employee> empdata;
public EmployeeManager(){
    this.empdata=new HashMap<>();

}
public void addEmployee(Employee emp){
empdata.put(emp.getId(),emp);
}
public Optional<Employee> getEmployeeById(int id){
    return Optional.ofNullable(empdata.get(id));
}
public List<Employee> getAllEmployees(){
    return new ArrayList<>(empdata.values());
}
    public List<Employee> filteerEmployeebysalary(int min){
        return empdata.values().stream().filter(emp->emp.getSalary().orElse(0.0)>=min).collect(Collectors.toList());

    }
    public List<Employee> sortEmployeebysalary(){
        return empdata.values().stream().sorted(Comparator.comparingDouble(e->e.getSalary().orElse(0.0))).collect(Collectors.toList());
    }

}