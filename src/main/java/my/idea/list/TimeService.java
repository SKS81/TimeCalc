package my.idea.list;

public class TimeService {

    public int get1FullMin(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int fullMin = sumSec / 60;
        return fullMin;
    }
    public int get1RemSec(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int minTemp = get1FullMin(sec1, sec2) * 60;
        int remSec = sumSec - minTemp;
        return remSec;
    }

    public int get2FullHor(int min1, int min2) {
        int sumMin = min1 + min2;
        int fullHor = sumMin / 60;
        return fullHor;
    }
    public int get2RemMin(int min1, int min2) {
        int sumMin = min1 + min2;
        int horTemp = get2FullHor(min1, min2) * 60;
        int remMin = sumMin - horTemp;
        return remMin;
    }

    public int get3FullDay(int hor1, int hor2) {
        int sumHor = hor1 + hor2;
        int fullDay = sumHor / 24;
        return fullDay;
    }
    public int get3RemHor(int hor1, int hor2) {
        int sumHor = hor1 + hor2;
        int horTemp = get3FullDay(hor1, hor2) * 24;
        int remHor = sumHor - horTemp;
        return remHor;
    }

}