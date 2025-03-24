public class Main {
    public static void main(String[] args) {
        //Задание 1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание 2

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задание 3

        for (int i = 0; i <= 17; i = i+2) {
            System.out.println(i);
        }
        //Задание 4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задание 5

        for (int i = 1904; i <= 2096; i = i+4) {
            System.out.println(i + " год является високосным");
        }
        //Задание 6

        for (int i = 7; i <= 100; i = i+7) {
            System.out.println(i);
        }
        //Задание 7

        for (int i = 1; i <= 512; i = i*2) {
            System.out.println(i);
        }
        //Задание 8
        int totalSavings= 0;
        int savings = 29000;
        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            totalSavings = totalSavings + savings;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задание 9
        int total = 0;
        int savingsInBank = 29000;
        for (int monthNumber = 1; monthNumber <= 12; monthNumber = monthNumber + 1) {
            total = total + savingsInBank;
            total = total + total/100;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание 10

        int answer;
        for (int i = 1; i <= 10; i++) {
            answer = 2*i;
            System.out.println("2 * " + i + " = " + answer);
        }
    }
}