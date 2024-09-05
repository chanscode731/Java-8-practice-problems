import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {

        List<Integer> myList1 = Arrays.asList(6,2,1,2,9,6,5,2,7,8,4);
        int max = myList1.stream()
                .max(Comparator.naturalOrder())
                .get();
        int min = myList1.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Max = " + max + " and Min = " + min);
    }
}
