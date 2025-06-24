public class Assignment3 {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0, digit;
        int temp = number;

        do {
            digit = number % 10;
            sum += digit;
            number /= 10;
        } while (number > 0);

        System.out.println("Sum of digits of " + temp + " is: " + sum);
    }
}
