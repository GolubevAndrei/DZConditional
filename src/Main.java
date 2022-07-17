public class Main {
    public static void main(String[] args) {
    // задание 1 и 2
    int clientOS = 1;
    int yearOS = 2014;
    if (clientOS == 1 && yearOS > 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientOS == 0 && yearOS > 2015){
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 0){
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    // задание 3
    int year = 2022;
    if (((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " год является високосным.");
    } else {
        System.out.println(year + " год не является високосным.");
    }
    // задание 4
    int deliveryDistance = 95;
    int dayDelivery = 0;
    boolean dis20 = deliveryDistance < 20;
    boolean dis2060 = deliveryDistance >= 20 && deliveryDistance <= 60;
    boolean dis60 = deliveryDistance > 60 && deliveryDistance <= 100;
    if (dis20) {
        dayDelivery += 1;
    } else if (dis2060) {
        dayDelivery += 2;
    } else if (dis60) {
        dayDelivery += 3;
    }
        System.out.println("Потребуется дней: " + dayDelivery);
    // Задание 5
    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Такого периода не существует");

    }

    }
}