public class Main {
    public static void main (String[] args){

        int current = 1; // текущий остаток на счете
        int payment = 1001; // сумма пополнения
        int each = 100; // начисления за каждый шаг пополнения
        int bonus = 1; // начисляемый бонус за каждый шаг пополнения

        if (payment >= 1000) {
            int total = ((payment/each)*bonus + payment + current);
            System.out.println(" Ваш счет успешно пополнен с учетом бонусов. Баланс состаляет: " + total );
        }
        else {
            int total = current + payment;
            System.out.println(" Ваш счет успешно пополнен. Баланс составляет: " + total);
        }
    }
}
