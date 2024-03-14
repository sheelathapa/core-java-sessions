package objectbasic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class DatePractise {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current date is : " + currentDate);

        Date birthDate = new Date(1998-1900, Calendar.FEBRUARY,17);
        System.out.println(birthDate);

        LocalDate currentLocalDate =LocalDate.now();
        System.out.println(currentLocalDate);
        System.out.println(currentLocalDate.plusDays(5));
       // currentDate.plusDays(5);

        LocalDate startDate = LocalDate.of(2024,01,29);
        System.out.println(startDate);

        String date = "2024-02-29";
        LocalDate convertedDate = LocalDate.parse(date);
       // System.out.println(convertedDate);
        LocalDate addedDate = convertedDate.plusDays(8);
        System.out.println(addedDate);


        String policyNumber =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] result = policyNumber.split(";");
        System.out.println(Arrays.toString(result));

        for(String op: result){
            System.out.println(op);
        }

    }
}
