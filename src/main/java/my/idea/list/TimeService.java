package my.idea.list;

public class TimeService {

    public int getRemSec(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int dopMin = sumSec / 60;
        int tempSec = dopMin * 60;
        int remSec = sumSec - tempSec;
        return remSec;
    }

    public int getDopMinFromSec(int sec1, int sec2) {
        int sumSec = sec1 + sec2;
        int dopMinFromSec = sumSec / 60;
        return dopMinFromSec;
    }

    public int getRemMin(int sec1, int sec2, int min1, int min2) {
        int sumMin = getDopMinFromSec(sec1, sec2) + min1 + min2;
        int dopHor = sumMin / 60;
        int tempMin = dopHor * 60;
        int remMin = sumMin - tempMin;
        return remMin;
    }

    public int getDopHorFromMin(int sec1, int sec2, int min1, int min2) {
        int sumMin = getDopMinFromSec(sec1, sec2) + min1 + min2;
        int dopHorFromMin = sumMin / 60;
        return dopHorFromMin;
    }

    public int getRemHor(int sec1, int sec2, int min1, int min2, int hor1, int hor2) {
        int sumHor = getDopHorFromMin(sec1, sec2, min1, min2) + hor1 + hor2;
        int dopDay = sumHor / 24;
        int tempHor = dopDay * 24;
        int remHor = sumHor - tempHor;
        return remHor;
    }

    public int getRemDay(int sec1, int sec2, int min1, int min2, int hor1, int hor2) {
        int sumHor = getDopHorFromMin(sec1, sec2, min1, min2) + hor1 + hor2;
        int dopDay = sumHor / 24;
        int remDay = dopDay;
        return remDay;
    }

    public int convMinToSec(int min1) {
        int fullSecToMin = min1 * 60;
        return fullSecToMin;
    }

    public int convHorToSec(int hor1) {
        int fullSecToHor = hor1 * 60 * 60;
        return fullSecToHor;
    }

    public int convHorToMin(int hor1) {
        int fullMinToHor = hor1 * 60;
        return fullMinToHor;
    }

    public int convDayToSec(int day1) {
        int fullSecToDay = day1 * 24 * 60 * 60;
        return fullSecToDay;
    }

    public int convDayToMin(int day1) {
        int fullMinToDay = day1 * 24 * 60;
        return fullMinToDay;
    }

    public int convDayToHor(int day1) {
        int fullHorToDay = day1 * 24;
        return fullHorToDay;
    }
}