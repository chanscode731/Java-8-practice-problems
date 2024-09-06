import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {

        int[] arr = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Sum = " + sum + " and Average = " + avg);
    }
}
