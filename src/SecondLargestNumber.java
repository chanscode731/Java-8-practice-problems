import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3,5,7,9,2,1,5,8);
        Integer secondLargest = myList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest number : " + secondLargest);
    }
}
