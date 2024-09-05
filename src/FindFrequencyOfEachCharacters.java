import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacters {
    public static void main(String[] args) {

        String str = "Hello World";
        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of each characters : " + charCount);
    }
}
