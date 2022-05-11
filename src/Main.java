import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Задание 1
        System.out.print("Введите год: ");
        checkYearLeap(in.nextInt());
//Задание 2
        System.out.print("Введите тип ОС на телефоне (0 — iOS или 1 — Android): ");
        int type = in.nextInt();
        System.out.print("Введите год выпуска ОС на телефоне: ");
        printVerOfProgramme(type, in.nextInt());
//Задание 3
        System.out.print("Введите дистанцию до клиента в км: ");
        System.out.println("Потребуется дней: " + calcDeliveryDays(in.nextInt()));
    }
    public static void checkYearLeap(int yearCheck) {
        boolean isYearLeap = (yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0;
        if (isYearLeap) {
            System.out.println(yearCheck + " год является високосным");
        }   else {
            System.out.println(yearCheck + " год не является високосным");
        }
    }
    public static void printVerOfProgramme(int clientOS, int clientDeviceYear) {
        boolean isOSAndroid = clientOS == 1;
        boolean isOldOS = clientDeviceYear < LocalDate.now().getYear();
        if (isOSAndroid && isOldOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!isOSAndroid && isOldOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (isOSAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static int calcDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 2;
        } else if (deliveryDistance >= 100) {
            day += 3;
        }
        return day;
    }
}