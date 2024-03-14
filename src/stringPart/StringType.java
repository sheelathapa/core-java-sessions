package stringPart;

import java.util.Arrays;

public class StringType {

    /*Strip out three policy details and print it :

    String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000*/
    public static void main(String[] args) {
        String s = "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] policyNumbers = {s} ;
        System.out.println(Arrays.toString(policyNumbers));
        System.out.println(s.substring(0,17));
        System.out.println(s.substring(17,34));
        System.out.println(s.substring(34,50));
        System.out.println(" ");

        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] object = policyNumbers1.split(";");

        System.out.println(Arrays.toString(object));

        for(String stripPolicyPart :object) {
            String[] policySplit = stripPolicyPart.split(",");


            // it will print all part.
            for (String stringPolicy : policySplit){
                System.out.print(stringPolicy + " \t");
            }
            System.out.println();
        }
       /* String fruits = "apple , banana, orange";
        String[] name= fruits.split(",",3);
        String[] object = {"name"};
       System.out.println(Arrays.toString(object));

        String[] strArr = {"apple , banana, orange"};
        Object[] objArr = {strArr, strArr}; // Array of String Arrays
        for (Object obj : objArr) {
            if (obj instanceof String[]) {
                String[] strArray = (String[]) obj;
                System.out.println(Arrays.toString(strArray));
                // System.out.println(obj);
            }
        }*/

    }
}
