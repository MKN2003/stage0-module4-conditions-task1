package school.mjc.stage0.conditions.task1;
import java.util.Scanner;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        numberToBeDetermined = -1;
        boolean res1 = true; boolean res2 = false;

        if(numberToBeDetermined > 0) {
            System.out.println(res1);
        }
        else {
            System.out.println(res2);
        }
    }
}
