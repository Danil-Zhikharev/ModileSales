public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int amount = 1500;
        int bonus;
        if(amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = currentBalance + amount + bonus;
        System.out.println("Ваш бонус: " + bonus + " руб");
        System.out.println("Итоговая сумма: " + total + " руб");
    }
}
