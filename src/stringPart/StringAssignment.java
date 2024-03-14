package stringPart;

import java.util.Arrays;
import java.util.Random;

public class StringAssignment {
    public static void main(String[] args) {
       /* WAP to create a string of length n where each character should only appear odd number of times. Example Dog,  Cat, mom (error)

                1 > n < 50000*/
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int n= 10;
        String[] fruits ={"Apple","Banana","Papaya","Orange","Guava"};
        System.out.println(Arrays.toString(fruits));

        for (int i=0;i<= fruits.length;i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
            sb.append(c);

            /*if(fruits[i]%2 != 0){
                System.out.println(fruits[i]);
                //System.out.println(fruits);
            }*/

        }
        //return sb.toString();
    }
}
