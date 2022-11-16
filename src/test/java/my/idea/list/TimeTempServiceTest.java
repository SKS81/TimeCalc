package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TimeTempServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void plusTimeCSVFile(int expectedDay, int expectedHor, int expectedMin, int expectedSec, int hor1, int hor2, int min1, int min2, int sec1, int sec2) {
        TimeTempService service = new TimeTempService();
        int actualDay = service.getRemDay(hor1, hor2);
        int actualHor = service.getRemHor(hor1, min1, hor2, min2);
        int actualMin = service.getRemMin(min1, sec1, min2, sec2);
        int actualSec = service.getRemSec(sec1, sec2);
        Assertions.assertEquals(expectedDay, actualDay);
        Assertions.assertEquals(expectedHor, actualHor);
        Assertions.assertEquals(expectedMin, actualMin);
        Assertions.assertEquals(expectedSec, actualSec);
    }

}
