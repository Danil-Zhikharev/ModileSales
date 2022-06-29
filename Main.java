public class Main {
    public static void main(String[] args) {
        int current_balance = 100;
        int amount = 1500;
        int bonus;
        if(amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = current_balance + amount + bonus;
        System.out.println("Ваш бонус: " + bonus + " руб");
        System.out.println("Итоговая сумма: " + total + " руб");
    }
}