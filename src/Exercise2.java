public class Exercise2 {
    public static void main(String[] args) {
        int onAccount = 100;
        int refill = 1500;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int totalOnAccount = onAccount + refill +bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговый счет:" + totalOnAccount);
    }
}
