package seminar3;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    // Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
    // является ли переданное число четным или нечетным. (код приложен в презентации)

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
    // и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    // Разработайте и протестируйте метод numberInInterval, который проверяет,
    // попадает ли переданное число в интервал (25;100). (код приложен в презентации)
    public boolean numberInInterval(int n) {
        return (n > 25 && n < 100);
    }

}
