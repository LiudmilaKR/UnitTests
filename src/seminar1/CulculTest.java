package seminar1;

import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
public class CulculTest {
    /**
     * Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает
     * сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить
     * этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает
     * недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
     * Не забудьте написать тесты для проверки этого поведения.
     */
    public static void main(String[] args) {
        checkDiscount();
    }
    private static void checkDiscount() {
        Locale.setDefault(Locale.US);
        assertThat(CulculatorHW.calculatingDiscount(100.0, 50)).isEqualTo(50.0);
        assertThat(CulculatorHW.calculatingDiscount(58.5, 30))
                .isCloseTo(40.95, Percentage.withPercentage(0.0001));
        assertThat(Double.parseDouble(new DecimalFormat("#########.##")
                .format(CulculatorHW.calculatingDiscount(58.5, 30))))
                .isEqualTo(40.95);
        assertThat(CulculatorHW.calculatingDiscount(58.3, 31))
                .isCloseTo(40.227, Offset.offset(0.001));
        assertThat(CulculatorHW.calculatingDiscount(75.8, 82))
                .isStrictlyBetween(13.64, 13.65);

    }
}
