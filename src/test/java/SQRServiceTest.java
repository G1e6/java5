import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustCalcIncorrectly() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSqr(200, 400);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeOfNegativeNumbers() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(-200, -300);

        Assertions.assertEquals(expected, actual);
    }

}
