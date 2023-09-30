package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class VehicleTest {
    private Car car;
    private Motorcycle moto;

    @BeforeEach
    void setUp() {
        car = new Car("Mercedes", "C200", 2021);
        moto = new Motorcycle("Yamaha", "FZ6", 2020);
    }
    /**
     * проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
     *              (instanceof)
     */
    @Test
    void checkCarIsInstanceOfVechicle() {
        assertInstanceOf(Vehicle.class, car);
    }
    /**
     * проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    void checkCarHasForWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    /**
     * проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    void checkMotoHasTowWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
    /**
     * проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    void checkCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    /**
     * проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    void checkMotoSpeed() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
     * машина останавливается (speed = 0)
     */
    @Test
    void checkCarPackSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0)
     */
    @Test
    void checkMotoPackSpeed() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}