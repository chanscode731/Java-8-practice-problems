import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_two_unsorted_arrays_into_single_sorted_array {
    public static void main(String[] args) {

        int[] a = new int[]{4,2,1,3};
        int[] b = new int[]{3,6,9,7,2};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .toArray();
        System.out.println("Combined array : " + Arrays.toString(c));
    }
}
