package my.idea.list;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Вас приветствует программа Калькулятор сложения времени");
        System.out.println();
        System.out.println("Введите номер требуемого действия:");
        System.out.println("1 - сложить только секунды");
        System.out.println("2 - сложить только минуты");
        System.out.println("3 - сложить только часы");
        System.out.println("4 - выход из программы");
        int change = console.nextInt();

        if (change == 1) {
            TimeService service = new TimeService();
            System.out.println("Укажите секунды, которые прибавляем:");
            int sec1 = console.nextInt();
            System.out.println("Укажите секунды, к которым прибавляем:");
            int sec2 = console.nextInt();
            int remSec = service.get1RemSec(sec1, sec2);
            int fullMin = service.get1FullMin(sec1, sec2);
            System.out.println();
            System.out.println("Рзультат: (минуты:секунды)");
            System.out.println(fullMin + ":" + remSec);
            System.exit(0);

        } if (change == 2) {
            TimeService service = new TimeService();
            System.out.println("Укажите минуты, которые прибавляем:");
            int min1 = console.nextInt();
            System.out.println("Укажите минуты, к которым прибавляем:");
            int min2 = console.nextInt();
            int remMin = service.get2RemMin(min1, min2);
            int fullHor = service.get2FullHor(min1, min2);
            System.out.println();
            System.out.println("Рзультат: (часы:минуты)");
            System.out.println(fullHor + ":" + remMin);
            System.exit(0);

        } if (change == 3) {
            TimeService service = new TimeService();
            System.out.println("Укажите часы, которые прибавляем:");
            int hor1 = console.nextInt();
            System.out.println("Укажите часы, к которым прибавляем:");
            int hor2 = console.nextInt();
            int remHor = service.get3RemHor(hor1, hor2);
            int fullDay = service.get3FullDay(hor1, hor2);
            System.out.println();
            System.out.println("Рзультат:");
            System.out.println(fullDay + " сутки(ок) и " + remHor + " час(а/ов)");
            System.exit(0);

        } if (change == 4) {
            System.out.println("Программа завершена.");
            System.exit(0);

        } else {
            System.out.println("Вы указали некорректное значение.");
            System.out.println("Перезапустите программу и повторите ввод.");
            System.exit(0);
        }

    }

}