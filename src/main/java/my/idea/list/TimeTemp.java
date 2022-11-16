package my.idea.list;

import java.util.Scanner;

public class TimeTemp {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        TimeTempService service = new TimeTempService();
        System.out.println("Вас приветствует программа Сложение времени");
        System.out.println();
        System.out.println("Укажите часы, которые прибавляем: (если часов нет - введите 0)");
        int hor1 = console.nextInt();
        System.out.println("Укажите часы, к которым прибавляем: (если часов нет - введите 0)");
        int hor2 = console.nextInt();
        System.out.println("Укажите минуты, которые прибавляем: (если минут нет - введите 0)");
        int min1 = console.nextInt();
        System.out.println("Укажите минуты, к которым прибавляем: (если минут нет - введите 0)");
        int min2 = console.nextInt();
        System.out.println("Укажите секунды, которые прибавляем: (если секунд нет - введите 0)");
        int sec1 = console.nextInt();
        System.out.println("Укажите секунды, к которым прибавляем: (если секунд нет - введите 0)");
        int sec2 = console.nextInt();
        int remSec = service.getRemSec(sec1, sec2);
        int remMin = service.getRemMin(min1, sec1, min2, sec2);
        int remHor = service.getRemHor(hor1, min1, hor2, min2);
        int remDay = service.getRemDay(hor1, hor2);
        System.out.println("Рзультат:");
        System.out.println(remDay + "дн., " + remHor + "час., " + remMin + "мин. и " + remSec + "сек.");
        System.exit(0);

    }

}