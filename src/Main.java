public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] payoutsArray = {32200, 47501, 29995, 59903, 0};
        int payoutTotal = 0;
        for (int current : payoutsArray) {
            payoutTotal += current;
        }
        System.out.println("Сумма трат за месяц составила " + payoutTotal + " рублей");

        //Задание 2
        int maxPayout = 0;
        int minPayout = payoutsArray[0];
        for (int i = 0; i < payoutsArray.length; i++) {
            if (payoutsArray[i] > maxPayout) {
                maxPayout = payoutsArray[i];
            }
            //если пятый элемент равен 0, то
            //пятого понедельника в этом месяце не было, соответственно не было и трат
            if (payoutsArray[i] < minPayout && payoutsArray[i] != 0) {
                minPayout = payoutsArray[i];
            }
        }
        System.out.print("Минимальная сумма трат за неделю составила " + minPayout + " рублей. ");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayout + " рублей");

        //Задание 3
        int numberOfMondays = payoutsArray[4] == 0 ? 4 : 5;
        float averagePayout = (float) payoutTotal / numberOfMondays;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n%n", averagePayout);

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Исходный массив: ");
        for (char currentChar : reverseFullName) {
            System.out.print(currentChar);
        }
        System.out.println();
        for (int i = 0; i < reverseFullName.length - 1 - i; i++) {
            char tempChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = tempChar;
        }
        System.out.println("Массив в правильном формате: ");
        for (char currentChar : reverseFullName) {
            System.out.print(currentChar);
        }
    }
}