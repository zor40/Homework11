import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        leapYear(2024);
        System.out.println();
        System.out.println("Task 2");
        operatingSystem(0, 2014);
        System.out.println();
        System.out.println("Task 3");
        delivery(95);
        System.out.println();
    }

    public static void leapYear(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным.");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println("Год должен быть больше, чем 1584.");
        }
    }

    public static void operatingSystem(int clientOperatingSystem, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOperatingSystem == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOperatingSystem == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOperatingSystem == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static void delivery(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + deliveryDay + " день.");
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDay += 1;
                System.out.println("Потребуется " + deliveryDay + " дня.");
            }
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay += 1;
            System.out.println("Потребуется " + deliveryDay + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("Потребуется " + deliveryDay + " дня.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}


