import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_And_Min_Upto3 {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Original list : " + listOfIntegers);
        System.out.println("3 min numbers : ");
        listOfIntegers.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("3 max numbers : ");
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
