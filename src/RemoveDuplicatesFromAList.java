import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAList {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueList = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println("Original list : " + listOfStrings);
        System.out.println("Unique list : " + uniqueList);
    }
}
