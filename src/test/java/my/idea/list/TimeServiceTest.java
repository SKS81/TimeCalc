package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TimeServiceTest {

    TimeService service = new TimeService();

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void plusAllTimeCSVFile(int expectedDay, int expectedHor, int expectedMin, int expectedSec, int hor1, int hor2, int min1, int min2, int sec1, int sec2) {
        int actualSec = service.getRemSec(sec1, sec2);
        Assertions.assertEquals(expectedSec, actualSec);
        int actualMin = service.getRemMin(sec1, sec2, min1, min2);
        Assertions.assertEquals(expectedMin, actualMin);
        int actualHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
        Assertions.assertEquals(expectedHor, actualHor);
        int actualDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
        Assertions.assertEquals(expectedDay, actualDay);
    }

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/data1.csv")
//    public void plus2_OnlySecCSVFile(int expectedMin, int expectedSec, int sec1, int sec2) {
//        TimeService service = new TimeService();
//        int actualMin = service.get2FullMin(sec1, sec2);
//        int actualSec = service.get3RemSec(sec1, sec2);
//        Assertions.assertEquals(expectedMin, actualMin);
//        Assertions.assertEquals(expectedSec, actualSec);
//    }

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/data2.csv")
//    public void plus3_OnlyMinCSVFile(int expectedHor, int expectedMin, int min1, int min2) {
//        TimeService service = new TimeService();
//        int actualHor = service.get3FullHor(min1, min2);
//        int actualMin = service.get3RemMin(min1, min2);
//        Assertions.assertEquals(expectedHor, actualHor);
//        Assertions.assertEquals(expectedMin, actualMin);
//    }

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/data3.csv")
//    public void plus4_OnlyHorCSVFile(int expectedDay, int expectedHor, int hor1, int hor2) {
//        TimeService service = new TimeService();
//        int actualDay = service.get4FullDay(hor1, hor2);
//        int actualHor = service.get4RemHor(hor1, hor2);
//        Assertions.assertEquals(expectedDay, actualDay);
//        Assertions.assertEquals(expectedHor, actualHor);
//    }
}