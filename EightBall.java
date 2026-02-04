import java.util.Random;
import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {
        Ball.gameStart();
    }
}

class Ball {
    static void gameStart() {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] array = {"Возможно", "Вряд ли", "Конечно",
                "Скорее всего", "Невозможно", "Вероятно",
                "Однозначно", "Думаю да", "Даже не думай",
                "Сомневаюсь", "100%", "Да", "Нет", "Бесспорно",
        };

        System.out.print("""
                ==========================================
                Приветствую! Я магический шар судьбы.
                Задавай свой вопрос, а я скажу тебе ответ.
                ==========================================
                -:\s""");
        while (true) {
            String answer = s.nextLine();
            System.out.println(array[random.nextInt(array.length)]);
            System.out.print("Введите ваш вопрос:\n-: ");
        }
    }
}