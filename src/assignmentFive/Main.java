package assignmentFive;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

        Professor professor1 = new Professor(5,"Professor One",50000.00, LocalDate.parse("1995-12-20",formatter));
        Professor professor2 = new Professor(4,"Professor Two",50000.00,LocalDate.parse("1995-12-30",formatter));
        Professor professor3 = new Professor(4,"Professor Three",50000.00,LocalDate.parse("1995-12-31",formatter));

        Secretary secretary1 = new Secretary(5.00,"Secretary One", 20000.00, LocalDate.parse("1995-12-30",formatter));
        Secretary secretary2 = new Secretary(6.00, "Secretary Two", 30000.00,LocalDate.parse("1995-10-20",formatter));

        DeptEmployee[] departments = new DeptEmployee[5];

        departments[0] = professor1;
        departments[1] = professor2;
        departments[2] = professor3;
        departments[3] = secretary1;
        departments[4] = secretary2;

        System.out.println("You want to see the sum of all Professor and Secretarys' salaries?");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        double sum = 0.0;


        if(input.equals("Y")){
            for(DeptEmployee e : departments){
                sum += e.computeSalary();

            }
            System.out.println("sum of salaries is " + sum);
        }








    }
}
