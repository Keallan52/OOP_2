public class Numbers {
    public static void numbers() {
        for (int i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0 && sumDigits(i) < 10) {
                System.out.print(i + " ");
            }
        }
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}