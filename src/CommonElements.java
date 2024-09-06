import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        System.out.println("common elements are : ");
        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);

    }
}
