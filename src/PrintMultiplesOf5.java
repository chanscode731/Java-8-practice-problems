import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultiplesOf5 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> multiplesOf5 = integers.stream()
                .filter(i -> i % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Original list : " + integers);
        System.out.println("Multiples of 5 : " + multiplesOf5);
    }
}
