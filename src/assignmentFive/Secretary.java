package assignmentFive;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    double overtimeHours;

    Secretary(double overtimeHours, String name, double salary, LocalDate date){
        super(name,salary,date);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours(){
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours){
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double computeSalary(){
        double salary = super.computeSalary();
        double totalOverTimeHours = 12 * overtimeHours;

        return salary + totalOverTimeHours;
    }


}
