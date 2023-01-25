package my.idea.list;

import my.idea.list.services.TimeService;
import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        TimeService service = new TimeService();

        int countRunner = 30;
        String choice = "Выберите требуемое действие:";
        String specify = "Укажите ";
        String entering = "Введите ";
        String enterZero = " - введите 0";
        String noPlus = "Вы ничего не сложили";
        String noConv = "Вы ничего не конвертировали";
        String backMainMenu = "Возврат в Главное меню";
        String result = "Результат:";
        String or = "ИЛИ ";
        String uncorrect = "Вы указали некорректное значение";
        String completeProg = "Выход из программы";
        String exitProgram = "Программа завершена";
        System.out.println("Калькулятор времени");
        System.out.println();

        for (int countRun = 0; countRun < countRunner; countRun++) mainMenu: {
            System.out.println(choice);
            System.out.println("1 - сложение времени");
            System.out.println("2 - вычитание времени");
            System.out.println("3 - конвертер времени");
            System.out.println("4 - " + completeProg);
            int change = console.nextInt();

            if (change == 1) {
                for (int countRun1 = 0; countRun1 < countRunner; countRun1++) menuTimePlus: {
                    System.out.println(choice);
                    System.out.println("1 - сложить вместе часы, минуты, секунды");
                    System.out.println("2 - сложить только секунды");
                    System.out.println("3 - сложить только минуты");
                    System.out.println("4 - сложить только часы");
                    System.out.println("5 - " + backMainMenu);
                    System.out.println("6 - " + completeProg);
                    int change1 = console.nextInt();

                    if (change1 == 1) {
                        System.out.println(specify + "часы, которые прибавляем: (если часов нет" + enterZero + ")");
                        int hor1 = console.nextInt();
                        System.out.println(specify + "часы, к которым прибавляем: (если часов нет" + enterZero + ")");
                        int hor2 = console.nextInt();
                        System.out.println(specify + "минуты, которые прибавляем: (если минут нет" + enterZero + ")");
                        int min1 = console.nextInt();
                        System.out.println(specify + "минуты, к которым прибавляем: (если минут нет" + enterZero +")");
                        int min2 = console.nextInt();
                        System.out.println(specify + "секунды, которые прибавляем: (если секунд нет" + enterZero + ")");
                        int sec1 = console.nextInt();
                        System.out.println(specify + "секунды, к которым прибавляем: (если секунд нет" + enterZero + ")");
                        int sec2 = console.nextInt();
                        int remSec = service.getRemSec(sec1, sec2);
                        int remMin = service.getRemMin(sec1, sec2, min1, min2);
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);

                        System.out.println(result);
                        if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                            System.out.println(noPlus);
                            System.out.println();
                        } else {
                            System.out.println(remDay + " сут., " + remHor + " час., " + remMin + " мин. и " + remSec + " сек.");
                            System.out.println();
                        }

                    } if (change1 == 2) {
                        int hor1 = 0;
                        int hor2 = 0;
                        int min1 = 0;
                        int min2 = 0;
                        System.out.println(specify + "секунды, которые прибавляем:");
                        int sec1 = console.nextInt();
                        System.out.println(specify + "секунды, к которым прибавляем:");
                        int sec2 = console.nextInt();
                        int remSec = service.getRemSec(sec1, sec2);
                        int remMin = service.getRemMin(sec1, sec2, min1, min2);
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);

                        System.out.println(result);
                        if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                            System.out.println(noPlus);
                            System.out.println();
                        } else {
                            System.out.println(remDay + " сут., " + remHor + " час., " + remMin + " мин. и " + remSec + " сек.");
                            System.out.println();
                        }

                    } if (change1 == 3) {
                        int hor1 = 0;
                        int hor2 = 0;
                        System.out.println(specify + "минуты, которые прибавляем:");
                        int min1 = console.nextInt();
                        System.out.println(specify + "минуты, к которым прибавляем:");
                        int min2 = console.nextInt();
                        int sec1 = 0;
                        int sec2 = 0;
                        int remMin = service.getRemMin(sec1, sec2, min1, min2);
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);

                        System.out.println(result);
                        if (remMin == 0 && remHor == 0 && remDay == 0) {
                            System.out.println(noPlus);
                            System.out.println();
                        } else {
                            System.out.println(remDay + " сут., " + remHor + " час. и " + remMin + " мин.");
                            System.out.println();
                        }

                    } if (change1 == 4) {
                        System.out.println(specify + "часы, которые прибавляем:");
                        int hor1 = console.nextInt();
                        System.out.println(specify + "часы, к которым прибавляем:");
                        int hor2 = console.nextInt();
                        int min1 = 0;
                        int min2 = 0;
                        int sec1 = 0;
                        int sec2 = 0;
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);

                        System.out.println(result);
                        if (remHor == 0 && remDay == 0) {
                            System.out.println(noPlus);
                            System.out.println();
                        } else {
                            System.out.println(remDay + " сут. и " + remHor + " час.");
                            System.out.println();
                        }

                    } if (change1 == 5) {
                        System.out.println(backMainMenu);
                        break mainMenu;

                    } if (change1 == 6) {
                        System.out.println(completeProg);
                        System.out.println(exitProgram);
                        System.exit(0);

                    } if (change1 != 1 && change1 != 2 && change1 != 3 && change1 != 4 && change1 != 5 && change1 != 6) {
                        System.out.println(uncorrect);
                    }
                    break menuTimePlus;
                }

            } if (change == 2) {
                System.out.println(specify + "сутки, из которых вычитаем: (если суток нет" + enterZero + ")");
                int day21 = console.nextInt();
                System.out.println(specify + "сутки, которые вычитаем: (если суток нет" + enterZero + ")");
                int day22 = console.nextInt();
                System.out.println(specify + "часы, из которых вычитаем: (если часов нет" + enterZero + ")");
                int hor21 = console.nextInt();
                System.out.println(specify + "часы, которые вычитаем: (если часов нет" + enterZero + ")");
                int hor22 = console.nextInt();
                System.out.println(specify + "минуты, из которых вычитаем: (если минут нет" + enterZero + ")");
                int min21 = console.nextInt();
                System.out.println(specify + "минуты, которые вычитаем: (если минут нет" + enterZero + ")");
                int min22 = console.nextInt();
                System.out.println(specify + "секунды, из которых вычитаем: (если секунд нет" + enterZero + ")");
                int sec21 = console.nextInt();
                System.out.println(specify + "секунды, которые вычитаем: (если секунд нет" + enterZero + ")");
                int sec22 = console.nextInt();

                System.out.println();
                System.out.println("ОБРАТИТЕ ВНИМАНИЕ:");
                System.out.println("Вычитание времени рассчитывается как из большего меньшее!");
                System.out.println();

                int hor1 = 0;
                int hor2 = 0;
                int min1 = 0;
                int min2 = 0;
                int sec1 = service.getDifferenceSec(sec21, sec22, min21, min22, hor21, hor22, day21, day22);
                int sec2 = 0;
                int remSec = service.getRemSec(sec1, sec2);
                int remMin = service.getRemMin(sec1, sec2, min1, min2);
                int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);

                System.out.println(result);
                if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                    System.out.println("Разницы во времени нет (временной интервал равен нулю)");
                    System.out.println();
                } else {
                    System.out.println("Разница во времени (временной интервал) составляет:");
                    System.out.println(remDay + " сут., " + remHor + " час., " + remMin + " мин. и " + remSec + " сек.");
                    System.out.println();
                }
                break mainMenu;

            } if (change == 3) {
                for (int countRun3 = 0; countRun3 < countRunner; countRun3++) menuTimeConv: {
                    System.out.println(choice);
                    System.out.println("1 - секунды в минуты, часы, сутки");
                    System.out.println("2 - минуты в секунды, часы, сутки");
                    System.out.println("3 - часы в секунды, минуты, сутки");
                    System.out.println("4 - сутки в секунды, минуты, часы");
                    System.out.println("5 - " + backMainMenu);
                    System.out.println("6 - " + completeProg);
                    int change3 = console.nextInt();

                    if (change3 == 1) {
                        System.out.println(entering + "секунды");
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

                        System.out.println(result);
                        if (remSec == 0 && remMin == 0 && remHor == 0 && remDay == 0) {
                            System.out.println(noConv);
                            System.out.println();
                        } else {
                            System.out.println(sec1 + " сек. = " + remDay + " сут., " + remHor + " час., " + remMin + " мин. и " + remSec + " сек.");
                            System.out.println();
                        }

                    } if (change3 == 2) {
                        int sec1 = 0;
                        int sec2 = 0;
                        System.out.println(entering + "минуты");
                        int min1 = console.nextInt();
                        int min2 = 0;
                        int hor1 = 0;
                        int hor2 = 0;
                        int remMin = service.getRemMin(sec1, sec2, min1, min2);
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                        int fullSecToMin = service.convMinToSec(min1);

                        System.out.println(result);
                        if (remMin == 0 && remHor == 0 && remDay == 0) {
                            System.out.println(noConv);
                            System.out.println();
                        } else {
                            System.out.println(min1 + " мин. = " + fullSecToMin + " сек.");
                            System.out.println(or + remDay + " сут., " + remHor + " час. и " + remMin + " мин.");
                            System.out.println();
                        }

                    } if (change3 == 3) {
                        int sec1 = 0;
                        int sec2 = 0;
                        int min1 = 0;
                        int min2 = 0;
                        System.out.println(entering + "часы");
                        int hor1 = console.nextInt();
                        int hor2 = 0;
                        int remHor = service.getRemHor(sec1, sec2, min1, min2, hor1, hor2);
                        int remDay = service.getRemDay(sec1, sec2, min1, min2, hor1, hor2);
                        int fullSecToHor = service.convHorToSec(hor1);
                        int fullMinToHor = service.convHorToMin(hor1);

                        System.out.println(result);
                        if (remHor == 0 && remDay == 0) {
                            System.out.println(noConv);
                            System.out.println();
                        } else {
                            System.out.println(hor1 + " час. = " + fullSecToHor + " сек.");
                            System.out.println(or + fullMinToHor + " мин.");
                            System.out.println(or + remDay + " сут. и " + remHor + " час.");
                            System.out.println();
                        }

                    } if (change3 == 4) {
                        System.out.println(entering + "количество суток");
                        int day1 = console.nextInt();
                        int fullSecToDay = service.convDayToSec(day1);
                        int fullMinToDay = service.convDayToMin(day1);
                        int fullHorToDay = service.convDayToHor(day1);

                        System.out.println(result);
                        if (day1 == 0) {
                            System.out.println(noConv);
                            System.out.println();
                        } else {
                            System.out.println(day1 + " сут. = " + fullSecToDay + " сек.");
                            System.out.println(or + fullMinToDay + " мин.");
                            System.out.println(or + fullHorToDay + " час.");
                            System.out.println();
                        }

                    } if (change3 == 5) {
                        System.out.println(backMainMenu);
                        break mainMenu;

                    } if (change3 == 6) {
                        System.out.println(completeProg);
                        System.out.println(exitProgram);
                        System.exit(0);

                    } if (change3 != 1 && change3 != 2 && change3 != 3 && change3 != 4 && change3 != 5 && change3 != 6) {
                        System.out.println(uncorrect);
                    }
                    break menuTimeConv;
                }

            } if (change == 4) {
                System.out.println(completeProg);
                System.out.println(exitProgram);
                System.exit(0);

            } if (change != 1 && change != 2 && change != 3 && change != 4) {
                System.out.println(uncorrect);
                System.out.println(backMainMenu);
                break mainMenu;
            }
        }
    }
}