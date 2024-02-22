package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    public static void main(String[] args) {
        testCalculateDiscount();
        testCalculateDiscountWithInvalidArguments();
    }

    public static void testCalculateDiscount() {
        double result = Calculator.calculateDiscount(100, 10);
        assertThat(result).isEqualTo(90); // Скидка 10% на 100 долларов должна составлять 90 долларов
        System.out.println("Тест на дискаунт пройден успешно.");
    }

    public static void testCalculateDiscountWithInvalidArguments() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Неверная сумма покупки или процент скидки.");
        System.out.println("Тест для дискаунт с недопустимыми аргументами пройден успешно.");
    }
}