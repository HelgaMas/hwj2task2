public class Main {
    public static void main(String[] args) {
        int startBalance = 100; //начальный баланс
        int refill = 1100; //сумма пополнения
        int bonus = refill > 1000 ? refill / 100 : 0; //расчет бонуса
        int sum = startBalance + refill + bonus; //расчет итоговой суммы

        System.out.println("Сумма бонусов = " + bonus);
        System.out.println("Итоговая сумма = " + sum);

    }
}