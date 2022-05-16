import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
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
*/ //Задание 4
        int[] arr4 = {3, 2, 1, 6, 5};
        toReverseArr(arr4);
        System.out.println(Arrays.toString(arr4));
//Задание 5
        String string5 = "aabccddefgghiijjkk";
        duplicate(string5);
//Задание 6
        int[] arr6 = generateRandomArray();
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", average(arr6));
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
    public static void toReverseArr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int buffer = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buffer;
        }
    }
    public static void duplicate(String string) {
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                System.out.println("В строке присутствует задублированный символ " + string.charAt(i));
                return;
            }
        }
        System.out.println("В строке нет дублей");
    }

    public static double average(int[] arr) {
        return toDouble(sum(arr)) / arr.length;
    }
    private static double toDouble(int integer) {
        return integer;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}