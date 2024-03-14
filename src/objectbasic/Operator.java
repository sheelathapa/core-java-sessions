package objectbasic;

public class Operator {
    float computer = 85;
    float science = 90;
    float maths = 20;
    float english = 95;
    float account = 75;

    boolean isFailed = computer < 32 || science < 32 || maths < 32 || english < 32 || account < 32;


    // percentage = add marks of all subjects / 500 * 100

    // isDistinction -> percentage >= 80
    // isFirstDivision -> percentage >= 70 AND/OR percentage < 80
    // isSecondDivision -> percentage >= 60
    // isThirdDivision -> percentage >= 40
    // isFailed -> percentage < 40

    int marks;
  double percent = ((85+90+20+95+75)/500)*100;

}
