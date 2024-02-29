package objectbasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {

        int result = Math.addExact(3,4);
        System.out.println(result);
        System.out.println(Math.max(5,9));
        System.out.println(Math.min(9,8.9f));
        System.out.println(Math.abs(-10));
        System.out.println(Math.sqrt(36));

        int randomNum = (int)(Math.random()*100);  // 0 to 100

        System.out.println("random number is : "+randomNum);

        System.out.println(Math.ceil(5.3)); //gives upper whole no.
        System.out.println(Math.floor(7.4f)); ////gives lower whole no.

        double a = 30.22;
        System.out.println(Math.signum(a));

        float x = 1324.433f;
        System.out.println(Math.round(x)); //returns nearest int values.

        System.out.println(Math.signum(x));
        
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1 ;  //Adding 1 to the result shifts the range to 1 to 4
        System.out.println("random number from 1 uto 5 is : "+ randomNumber );

        System.out.println(  );

        // Date Conversion :
        String time1 = "2024-02-28";
        String time2 = "02-28-2024";
        String time3 = "2024/02/28";

        SimpleDateFormat time1Format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat time2Format = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH);
        SimpleDateFormat time3Format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
        SimpleDateFormat outputResult = new SimpleDateFormat("EEE dd MMM", Locale.ENGLISH);

        try {
            Date date1 = time1Format.parse(time1);  //parse will convert string datatype into another datatype
            Date date2 = time2Format.parse(time2);
            Date date3 = time3Format.parse(time3);

            String formattedTime1 = outputResult.format(date1);
            String formattedTime2 = outputResult.format(date2);
            String formattedTime3 = outputResult.format(date3);

            System.out.println("Formatted time for " + time1 + ": " + formattedTime1);
            System.out.println("Formatted time for " + time2 + ": " + formattedTime2);
            System.out.println("Formatted time for " + time3 + ": " + formattedTime3);

            //parse exception is a checked exception that signal unexpected error while parsing an i/p.
        } catch (ParseException ex)  //this happens when input doesnot match with an expected format
        {
            ex.getMessage();
        }

        //Creating random value from 1 to 95.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max. number : ");
        int maximum =sc.nextInt();


        System.out.println("Enter the min.number :");
        int minimum = sc.nextInt();

        int range = maximum - minimum + 1 ; //Adding 1 to include maximum in range
        Random rn = new Random();
        int results = rn.nextInt(range) + minimum;
        System.out.println("Random number between : "+ minimum + " and : "+ maximum +" is "+ results);

    }


}
