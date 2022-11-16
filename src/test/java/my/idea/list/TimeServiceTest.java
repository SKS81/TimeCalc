package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TimeServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data1.csv")
    public void plusSec1CSVFile(int expectedMin, int expectedSec, int sec1, int sec2) {
        TimeService service = new TimeService();
        int actualMin = service.get1FullMin(sec1, sec2);
        int actualSec = service.get1RemSec(sec1, sec2);
        Assertions.assertEquals(expectedMin, actualMin);
        Assertions.assertEquals(expectedSec, actualSec);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data2.csv")
    public void plusMin2CSVFile(int expectedHor, int expectedMin, int min1, int min2) {
        TimeService service = new TimeService();
        int actualHor = service.get2FullHor(min1, min2);
        int actualMin = service.get2RemMin(min1, min2);
        Assertions.assertEquals(expectedHor, actualHor);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data3.csv")
    public void plusHor3CSVFile(int expectedDay, int expectedHor, int hor1, int hor2) {
        TimeService service = new TimeService();
        int actualDay = service.get3FullDay(hor1, hor2);
        int actualHor = service.get3RemHor(hor1, hor2);
        Assertions.assertEquals(expectedDay, actualDay);
        Assertions.assertEquals(expectedHor, actualHor);
    }

}