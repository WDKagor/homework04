public class Main {
    public static void main(String[] args) {
        System.out.println ("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println ("Если возраст человека равен " + age + " лет, он совершеннолетний");}
        else System.out.println("Возраст равен " + age + " лет, человек не достиг совершенолетия, нужно подождать");

        System.out.println ("   ");
        System.out.println ("Задача 2");
        int temp = 4;
        if (temp < 5) {System.out.println("На улице холодно, нужно надеть шапку");
        }
        else System.out.println("Сегодня тепло, можно идти без шапки");

        System.out.println ("   ");
        System.out.println ("Задача 3");
        int speed = 80;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно спокойно ехать");
        }
        else System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штаф");

        System.out.println ("   ");
        System.out.println ("Задача 4");
        int age2 = 15;
        if (age2 > 2 && age2 < 6) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");}
        if (age2 > 7 && age2 < 17) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");}
        if (age2 > 18 && age2 < 24) {System.out.println("Если возраст человека равен " + age2 + " лет, то его место в университете");}
        if (age2 > 24) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему пора ходить на работу");}




    }
}