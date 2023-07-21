import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Carbon14DatingTest {
    @Test
    public void testRemainingAmount(){
        Carbon14Dating e = new Carbon14Dating(1);
        e.setRemainingAmount(1);
        assertEquals(0.5, 1);




    }
    //#1 Build a test for calculateAge();

    /*
        #2 Build a test for getRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for getRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.
}
