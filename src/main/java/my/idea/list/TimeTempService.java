package my.idea.list;

public class TimeTempService {

    public int getRemSec(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int minTemp = getFullTempMin(sec1, sec2) * 60;
        int remSec = sumSec - minTemp;
        return remSec;
    }

    public int getFullTempMin(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int remTempMin = sumSec / 60;
        return remTempMin;
    }

    public int getRemMin(int min1, int sec1, int min2, int sec2) {
        int sumTempMin = min1 + min2;
        int horTem = getFullTempHor(min1, min2) * 60;
        int remTempMin = sumTempMin - horTem;
        int remMin = getFullTempMin(sec1, sec2) + remTempMin;
        return remMin;
    }

    public int getFullTempHor(int min1, int min2) {
        int sumMin = min1 + min2;
        int remTempHor = sumMin / 60;
        return remTempHor;
    }

    public int getRemHor(int hor1, int min1, int hor2, int min2) {
        int sumTempHor = hor1 + hor2;
        int dayTemp = getFullTempDay(hor1, hor2) * 24;
        int remTempHor = sumTempHor - dayTemp;
        int remHor = getFullTempHor(min1, min2) + remTempHor;
        return remHor;
    }

    public int getFullTempDay(int hor1, int hor2) {
        int sumHor = hor1 + hor2;
        int remTempDay = sumHor / 24;
        return remTempDay;
    }

    public int getRemDay(int hor1, int hor2) {
        int remDay = getFullTempDay(hor1, hor2);
        return remDay;
    }

}