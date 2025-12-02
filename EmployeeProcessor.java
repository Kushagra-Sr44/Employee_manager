package EmployeeDataAnalyze;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

public class EmployeeProcessor extends Thread {
    private EmployeeManager empman;
    private int empid;
    public EmployeeProcessor(int empid,EmployeeManager empman){
        this.empid=empid;
        this.empman=empman;
    }
    @Override
    public void run(){
        try{
        Optional<Employee>em=empman.getEmployeeById(empid);
        em.ifPresentOrElse(e->System.out.println("Processing employee"+e),
         ()->System.out.println("Employee with id"+empid+"not found"));
        }
        catch(Exception e){
            System.out.print("Error in processing employee"+e.getMessage());
        }

    }
}
