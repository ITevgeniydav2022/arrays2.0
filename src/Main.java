public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        for (int paymentPerDay : arr) {
            sum = sum + paymentPerDay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");

        // Задание 2
        System.out.println("Задание 2");
        int max = 99_999;
        int min = 200_001;
        for (int paymentPerDay : arr) {
            if (paymentPerDay < min) {
                min = paymentPerDay;
            }
            if (paymentPerDay > max) {
                max = paymentPerDay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + ". " + "Максимальная сумма трат за день составила " + max + ". ");

        // Задание 3
        System.out.println("Задание 3");
        double average = (double) sum / arr.length;
        System. out.println("Средняя сумма трат за месяц составила " + average + " рублей ");

        // Задание 4
        System.out.println("Задание 4");
        char[] reversFullName = {'й', 'и', 'н', 'е', 'г', 'в', 'Е', ' ', 'в', 'о', 'д', 'ы', 'в', 'а', 'Д'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}