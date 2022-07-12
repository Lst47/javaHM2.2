 public class main {
        public static void main(String[] args) {

            int balance = 100;
            int summ =1100;

            int total = balance + summ ;
            int bonus = (total - balance) / 100;
            int totalBonus = total + bonus;

            if (total < 1000) {
                System.out.println("Бонусов нет, итоговая сумма на счету клиента - " + total);
            } else  {
                System.out.println("Бонус равен"+ bonus + "рублям, итоговая сумма на счету клиента -" + totalBonus);

            }

        }
    }


