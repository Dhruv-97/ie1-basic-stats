import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {101, 5, 1, 9, 2};
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));
    }

    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().orElseThrow();
    }

    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
