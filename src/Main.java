
public class Main {
    public static void main(String[] args) {
        int sum = 1000;
        int bonusSal =20;
        int bonus;
        if (sum >= 20 ) {
            bonus = sum/bonusSal;
            System.out.println("Сумма ваших бонусов составила: " + bonus);
        } else {
            System.out.println("Суммы вашей покупки недостаточно для получения бонуса");
        }
    }
}