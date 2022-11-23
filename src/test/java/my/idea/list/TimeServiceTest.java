package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TimeServiceTest {

    TimeService service = new TimeService();

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data1.csv")
    public void point1PlusAllTimeCSVFile(int expectedDay, int expectedHor, int expectedMin, int expectedSec, int hor1, int hor2, int min1, int min2, int sec1, int sec2) {
        int actualSec = service.getRemSec(sec1, sec2);
        Assertions.assertEquals(expectedSec, actualSec);
        int actualMin = service.getRemMin(sec1, sec2, min1, min2);
        Assertions.assertEquals(expectedMin, actualMin);
        int actualHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
        Assertions.assertEquals(expectedHor, actualHor);
        int actualDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data2.csv")
    public void point2MinusTimeCSVFile(int expectedTime, int sec21, int sec22, int min21, int min22, int hor21, int hor22, int day21, int day22) {
        int actualTime = service.getDifferenceSec(sec21, sec22, min21, min22, hor21, hor22, day21, day22);
        Assertions.assertEquals(expectedTime, actualTime);
    }

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/data2.csv")
//    public void plus3_OnlyMinCSVFile(int expectedHor, int expectedMin, int min1, int min2) {
//        int actualHor = service.get3FullHor(min1, min2);
//        int actualMin = service.get3RemMin(min1, min2);
//        Assertions.assertEquals(expectedHor, actualHor);
//        Assertions.assertEquals(expectedMin, actualMin);
//    }

//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/data3.csv")
//    public void plus4_OnlyHorCSVFile(int expectedDay, int expectedHor, int hor1, int hor2) {
//        int actualDay = service.get4FullDay(hor1, hor2);
//        int actualHor = service.get4RemHor(hor1, hor2);
//        Assertions.assertEquals(expectedDay, actualDay);
//        Assertions.assertEquals(expectedHor, actualHor);
//    }
}