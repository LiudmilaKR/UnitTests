package seminar5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static seminar5.Main.*;

public class MainTest {
    /**
     * Тест метода создания списка
     * Сценарии:
     *  1. Размер списка - положительное число
     *  2. Размер списка = 0
     *  3. Размер списка - отрицательное число - ошибка
     */
    @Test
    void testCreateList() {
        assertEquals(createList(5).size(), 5);
        assertEquals(createList(0), new ArrayList<>());
        assertThatThrownBy(() -> createList(-5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Некорректный размер списка");
    }

    /**
     * Тест метода нахождения среднего значения элементов списка
     * Сценарии:
     *  1.В списке есть элементы
     *  2.Список с размером 0
     */
    @Test
    void testMeadList() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 4, -3, 2));
        assertEquals(meanList(testList), testList.stream().mapToInt(x -> x).average().getAsDouble());
        assertEquals(meanList(createList(0)), 0.0);
    }

    /**
     * Тесты метод сравнения средних значений 2-х списков
     * Сценарии:
     *  1.Среднее значение элелементов первого списка больше среднего значения элементов второго
     *  2.Среднее значение элелементов первого списка меньше среднего значения элементов второго
     *  3.Средние значения элелементов обоих списков равны
     */
    @Test
    void testCompareListsMean1() {
        List<Integer> testList1 = new ArrayList<>(Arrays.asList(1, 4, -3, 2));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(-3, 1, 3));
        assertThat(compareListsMean(testList1, testList2)).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void testCompareListsMean2() {
        List<Integer> testList1 = new ArrayList<>(Arrays.asList(1, 4, -5, 2));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(-3, 5, 3));
        assertThat(compareListsMean(testList1, testList2)).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void testCompareListsMean3() {
        List<Integer> testList1 = new ArrayList<>(Arrays.asList(1, 4, -5, 4));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(-4, 4, 3));
        assertThat(compareListsMean(testList1, testList2)).isEqualTo("Средние значения равны");
    }
}
