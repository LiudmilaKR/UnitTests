package seminar2;

public class Main {
    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):
         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))
         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
             (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
             машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
             мотоцикл останавливается (speed = 0)
    */
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "C200", 2021);
        Car car2 = new Car("BMW", "X5", 2022);
        Motorcycle moto1 = new Motorcycle("Yamaha", "FZ6", 2020);
        Motorcycle moto2 = new Motorcycle("Honda", "VT1100", 2022);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(moto1);
        System.out.println(moto2);
        car1.testDrive();
        System.out.println(car1.getSpeed());
    }
}