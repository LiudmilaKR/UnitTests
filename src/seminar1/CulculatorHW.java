package seminar1;

public class CulculatorHW {
    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        return purchaseAmount * (1 - discountAmount/100.);
    }
}
