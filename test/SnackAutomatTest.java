import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SnackAutomatTest {

    @DisplayName("Tester for Illegalexception")
    @Test
    void køb() {

        // Arrange - setup our test objects
        int varePris = -100;
        int betaltBeløb = -100;
        int byttePenge = betaltBeløb - varePris;

        if (varePris < 0 || betaltBeløb < 0) {
            throw new ArithmeticException("Beløbene må ikke være negative"); //Illegalexception
        } else if (betaltBeløb < varePris) {
            throw new ArithmeticException("Det betalte beløb er mindre end varens pris"); //Lave vores egen exception "For få penge"
        }

        // Act - do the actual calc or method run
        int actualValue = (-100 -100);
        int expectedValue = -200;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);

    }

    @DisplayName("Test at det virker")
    @Test
    void køb1() {

        // Arrange - setup our test objects
        int varePris = 50;
        int betaltBeløb = 100;
        int byttePenge = betaltBeløb - varePris;

        if (varePris < 0 || betaltBeløb < 0) {
            throw new ArithmeticException("Beløbene må ikke være negative"); //Illegalexception
        } else if (betaltBeløb < varePris) {
            throw new ArithmeticException("Det betalte beløb er mindre end varens pris"); //Lave vores egen exception "For få penge"
        }

        // Act - do the actual calc or method run
        int actualValue = (betaltBeløb - varePris);
        int expectedValue = 50;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);

    }

    @DisplayName("Tester for egen exception")
    @Test
    void køb2() throws HjemmeLavetException {

        // Arrange - setup our test objects
        int varePris = 200;
        int betaltBeløb = 100;
        int byttePenge = betaltBeløb - varePris;

        // Act - do the actual calc or method run
        if (varePris < 0 || betaltBeløb < 0) {
            throw new ArithmeticException("Beløbene må ikke være negative"); //Illegalexception
        } else if (betaltBeløb < varePris) {
            throw new HjemmeLavetException(); //Lave vores egen exception "For få penge"
        }

        // Assert - check if actual val is equal to expected val
    }


    @Disabled
    @Test
    void byttePenge() {
    }

    @Test
    void byttePenge1() {
        Assertions.fail("Not implemented yet");
    }

}