package my.idea.list;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        TimeService service = new TimeService();
        System.out.println("Вас приветствует программа Калькулятор времени");
        System.out.println();
        System.out.println("Выберите требуемое действие:");
        System.out.println("1 - сложение времени");
        System.out.println("2 - вычитание времени");
        System.out.println("3 - конвертер времени");
        System.out.println("4 - выход из программы");
        int change = console.nextInt();

        if (change == 1) {
            System.out.println("Выберите требуемое действие:");
            System.out.println("1 - сложить вместе часы, минуты, секунды");
            System.out.println("2 - сложить только секунды");
            System.out.println("3 - сложить только минуты");
            System.out.println("4 - сложить только часы");
            System.out.println("5 - выход из программы");
            int change1 = console.nextInt();

            if (change1 == 1) {
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
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                System.out.println("Рзультат:");

                if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                    System.out.println("Вы ничего не сложили");

                } else {
                    System.out.println(remDay + "дн., " + remHor + "час., " + remMin + "мин. и " + remSec + "сек.");
                }
                System.exit(0);

            } if (change1 == 2) {
                int hor1 = 0;
                int hor2 = 0;
                int min1 = 0;
                int min2 = 0;
                System.out.println("Укажите секунды, которые прибавляем:");
                int sec1 = console.nextInt();
                System.out.println("Укажите секунды, к которым прибавляем:");
                int sec2 = console.nextInt();
                int remSec = service.getRemSec(sec1, sec2);
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                System.out.println("Рзультат:");
                System.out.println(remDay + "дн., " + remHor + "час., " + remMin + "мин. и " + remSec + "сек.");
                System.exit(0);

            } if (change1 == 3) {
                int hor1 = 0;
                int hor2 = 0;
                System.out.println("Укажите минуты, которые прибавляем:");
                int min1 = console.nextInt();
                System.out.println("Укажите минуты, к которым прибавляем:");
                int min2 = console.nextInt();
                int sec1 = 0;
                int sec2 = 0;
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                System.out.println("Рзультат:");
                System.out.println(remDay + "дн., " + remHor + "час., и " + remMin + "мин.");
                System.exit(0);

            } if (change1 == 4) {
                System.out.println("Укажите часы, которые прибавляем:");
                int hor1 = console.nextInt();
                System.out.println("Укажите часы, к которым прибавляем:");
                int hor2 = console.nextInt();
                int min1 = 0;
                int min2 = 0;
                int sec1 = 0;
                int sec2 = 0;
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                System.out.println("Рзультат:");
                System.out.println(remDay + "дн., и " + remHor + "час.");
                System.exit(0);

            } if (change1 == 5) {
                System.out.println("Программа завершена.");
                System.exit(0);

            } else {
                System.out.println("Вы указали некорректное значение.");
                System.out.println("Перезапустите программу и повторите ввод.");
                System.exit(0);
            }

        } if (change == 2) {
            System.out.println("Укажите часы, из которых вычитаем: (если часов нет - введите 0)");
            int hor21 = console.nextInt();
            System.out.println("Укажите часы, которые вычитаем: (если часов нет - введите 0)");
            int hor22 = console.nextInt();
            System.out.println("Укажите минуты, из которых вычитаем: (если минут нет - введите 0)");
            int min21 = console.nextInt();
            System.out.println("Укажите минуты, которые вычитаеем: (если минут нет - введите 0)");
            int min22 = console.nextInt();
            System.out.println("Укажите секунды, из которых вычитаем: (если секунд нет - введите 0)");
            int sec21 = console.nextInt();
            System.out.println("Укажите секунды, которые вычитаем: (если секунд нет - введите 0)");
            int sec22 = console.nextInt();
            System.out.println("ОБРАТИТЕ ВНИМАНИЕ:");
            System.out.println("Вычитание времени рассчитывается как из большего меньшее!");
            int hor1 = 0;
            int hor2 = 0;
            int min1 = 0;
            int min2 = 0;
            int sec1 = service.getDifferenceSec(sec21, sec22, min21, min22, hor21, hor22);
            int sec2 = 0;
            int remSec = service.getRemSec(sec1, sec2);
            int remMin = service.getRemMin(sec1, sec2, min1, min2);
            int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
            int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
            System.out.println("Разница во времени (временной интервал) составит:");
            System.out.println(remDay + "дн., " + remHor + "час., " + remMin + "мин. и " + remSec + "сек.");
            System.exit(0);

        } if (change == 3) {
            System.out.println("Выберите требуемое действие:");
            System.out.println("1 - секунды в минуты, часы, сутки");
            System.out.println("2 - минуты в секунды, часы, сутки");
            System.out.println("3 - часы в секунды, минуты, сутки");
            System.out.println("4 - сутки в секунды, минуты, часы");
            System.out.println("5 - выход из программы");
            int change3 = console.nextInt();

            if (change3 == 1) {
                System.out.println("Введите секунды");
                int sec1 = console.nextInt();
                int sec2 = 0;
                int min1 = 0;
                int min2 = 0;
                int hor1 = 0;
                int hor2 = 0;
                int remSec = service.getRemSec(sec1, sec2);
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                System.out.println("Рзультат:");

                if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                    System.out.println("Вы ничего не конвертировали");

                } else {
                    System.out.println(sec1 + "сек. = " + remDay + "сут., " + remHor + "час., " + remMin + "мин. и " + remSec + "сек.");
                }
                System.exit(0);

            } if (change3 == 2) {
                int sec1 = 0;
                int sec2 = 0;
                System.out.println("Введите минуты");
                int min1 = console.nextInt();
                int min2 = 0;
                int hor1 = 0;
                int hor2 = 0;
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                int fullSecToMin = service.convMinToSec(min1);
                System.out.println("Рзультат:");

                if (remMin == 0 && remHor == 0 && remDay == 0) {
                    System.out.println("Вы ничего не конвертировали");

                } else {
                    System.out.println(min1 + "мин. = " + fullSecToMin + "сек.");
                    System.out.println("ИЛИ " + remDay + "сут., " + remHor + "час., и " + remMin + "мин.");
                }
                System.exit(0);

            } if (change3 == 3) {
                int sec1 = 0;
                int sec2 = 0;
                int min1 = 0;
                int min2 = 0;
                System.out.println("Введите часы");
                int hor1 = console.nextInt();
                int hor2 = 0;
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                int fullSecToHor = service.convHorToSec(hor1);
                int fullMinToHor = service.convHorToMin(hor1);
                System.out.println("Рзультат:");

                if (remHor == 0 && remDay == 0) {
                    System.out.println("Вы ничего не конвертировали");

                } else {
                    System.out.println(hor1 + "час. = " + fullSecToHor + "сек.");
                    System.out.println("ИЛИ " + fullMinToHor + "мин.");
                    System.out.println("ИЛИ " + remDay + "сут., и " + remHor + "час.");
                }
                System.exit(0);

            } if (change3 == 4) {
                System.out.println("Введите дни");
                int day1 = console.nextInt();
                int fullSecToDay = service.convDayToSec(day1);
                int fullMinToDay = service.convDayToMin(day1);
                int fullHorToDay = service.convDayToHor(day1);
                System.out.println("Рзультат:");

                if (day1 == 0) {
                    System.out.println("Вы ничего не конвертировали");

                } else {
                    System.out.println(day1 + "сут. = " + fullSecToDay + "сек.");
                    System.out.println("ИЛИ " + fullMinToDay + "мин.");
                    System.out.println("ИЛИ " + fullHorToDay + "час.");
                }
                System.exit(0);

            } if (change3 == 5) {
                System.out.println("Программа завершена.");
                System.exit(0);

            } else {
                System.out.println("Вы указали некорректное значение.");
                System.out.println("Перезапустите программу и повторите ввод.");
                System.exit(0);
            }

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