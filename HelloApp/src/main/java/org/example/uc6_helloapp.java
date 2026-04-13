import java.util.Scanner;

    public class DigitFrequencySimple {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int number;
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            int[] freq = new int[10];

            // Count digits
            while (number > 0) {
                int digit = number % 10;
                freq[digit] = freq[digit] + 1;
                number = number / 10;
            }

            // Print result
            for (int i = 0; i < 10; i++) {
                if (freq[i] != 0) {
                    System.out.println(i + " occurs " + freq[i] + " times");
                }
            }
        }
    }
}
