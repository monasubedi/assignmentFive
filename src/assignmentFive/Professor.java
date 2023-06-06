package assignmentFive;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    int numberOfPublications;

    Professor(int numberOfPublications, String name, double salary, LocalDate date){
        super(name,salary,date);
        this.numberOfPublications = numberOfPublications;

    }

    public void setNumberOfPublications(int numberOfPublications){
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }

}
