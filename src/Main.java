public class Main {
    public static void main(String[] args) {

        //task1
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        int clientDeviceYear = 2015;
        if ((clientDeviceYear >= 2015) && (clientOS == 0)) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientDeviceYear >= 2015) && (clientOS == 1)) {
                System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //task3
        int year = 2024;
        boolean everyFourth = (year % 4) == 0;
        boolean everyHundredth = (year % 100) != 0;
        boolean everyFourHundredth = (year % 400) == 0;
        if ((year > 1584) && (everyFourth) && ((everyHundredth) || (everyFourHundredth))) {
            System.out.println("Год високосный");
        } else {
                System.out.println("Это невисокосный год");
        }

        //task4
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 100) {
            System.out.println("На ваш адрес доставка не осуществляется");
        } else {
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
                System.out.println("Дней потребуется: " + days);
        }

        //task5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца не существует");
        }
    }
}