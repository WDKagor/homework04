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
        if (age2 > 2 && age2 <= 6) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");}
        else if (age2 >= 7 && age2 <= 17) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");}
        else if (age2 >= 18 && age2 < 24) {System.out.println("Если возраст человека равен " + age2 + " лет, то его место в университете");}
        else if (age2 >= 24) {System.out.println("Если возраст человека равен " + age2 + " лет, то ему пора ходить на работу");}

        System.out.println ("   ");
        System.out.println ("Задача 5");
        int ageChild = 5;
        if (ageChild < 5) {System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он не может кататься на аттракционе");}
        if (ageChild >= 5 && ageChild < 14) {System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он может кататься только в сопровождении взрослого");}
        if (ageChild >= 14) {System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он может кататься без сопровождения взрослого");}

        System.out.println ("   ");
        System.out.println ("Задача 6");
        int numberOfPeopleInTheCarriage = 47;
        if (numberOfPeopleInTheCarriage >= 60 && numberOfPeopleInTheCarriage < 102) {System.out.println("В вагоне свободно только " + (102 - numberOfPeopleInTheCarriage) + " стоячих мест");}
        else if (numberOfPeopleInTheCarriage < 60 && numberOfPeopleInTheCarriage < 102) {System.out.println("В вагоне свободно " + (60 - numberOfPeopleInTheCarriage) + " сидячих мест и " + (102 - 60) + " стоячих места");}
        else if (numberOfPeopleInTheCarriage == 102) {System.out.println ("В вагоне нет свободных мест");};











    }
}