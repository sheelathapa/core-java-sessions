package enumPart;

import java.util.ArrayList;
import java.util.EnumSet;

public enum Gender {
    MALE ("M"),
    FEMALE("F"),
    OTHER("O");
    Gender() {
        System.out.println("Constructor is called");
    }
    Gender(String abbrv){
        System.out.println("Abbrevation value is : " + abbrv);
    }

    public static void main(String[] args) {
        Gender gender = Gender.MALE;
        System.out.println("Ram is :"+ gender);

        EnumSet<Gender>genderList = EnumSet.allOf(Gender.class);
        System.out.println(genderList);

        ArrayList<String> genderItem = new ArrayList<>();
        genderItem.add(Constants.FEMALE);
        genderItem.add(Constants.MALE);
        genderItem.add(Constants.OTHER);

        System.out.println(genderItem);

    }
}
