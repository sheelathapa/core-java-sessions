package userInputPart;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputTakingPart {
    public static void main(String[] args) throws IOException {

        System.out.println( );
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the firstNumber : ");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter the secondNumber : ");
        double secondNumber = sc.nextDouble();

        System.out.println("Enter the thirdNumber : ");
        double thirdNumber = sc.nextDouble();

        double output = (firstNumber + secondNumber + thirdNumber)*10;
        System.out.println("The sum of output is :  " + output);

       // String result =double.format(output);

    }
}
