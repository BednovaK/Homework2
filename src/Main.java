public class Main {
    public static void main(String[] args) {

        int startBalanse = 100;
        int increaseSumm = 200;

        int bonusRub = increaseSumm / 100;
        if (increaseSumm < 1000) {
            bonusRub = 0;
        }
        int finalSumm = startBalanse + increaseSumm + bonusRub;

        System.out.println("Сумма бонусных рублей");
        System.out.println(bonusRub);
        System.out.println("Баланс");
        System.out.println(finalSumm);
    }
}

