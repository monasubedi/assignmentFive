package assignmentFive;

import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate date = LocalDate.now();

    DeptEmployee(String name,double salary, LocalDate date){
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public LocalDate getDate(){
        return date;
    }

    public double computeSalary(){
        return salary;
    }




}
