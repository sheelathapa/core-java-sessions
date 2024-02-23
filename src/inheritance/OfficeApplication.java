package inheritance;

import java.time.LocalDate;

public class OfficeApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sheela");
        employee.setAddress("Lalitpur");
        employee.setGender("Female");
        employee.setSalary(2000);
        employee.setId(1);
        employee.setJoiningDate(LocalDate.now());

        Manager manager=new Manager();
        manager.setName("John");
        manager.setAddress("Bhaktapur");
        manager.setGender("Male");
        manager.setSalary(35000);
        manager.setBonus(1000);

        Director director=new Director();
        director.setName("Hari");
        director.setAddress("ABC");
        director.setGender("Female");
        director.setSalary(5000);
        director.setBonus(4000);
        director.setPosition("First");
        director.setSharePercentage(40.25f);    }

}
