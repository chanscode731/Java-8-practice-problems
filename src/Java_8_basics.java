import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java_8_basics {
    public static void main(String[] args) {

        // separate odd and even numbers from a given list of integers
        List<Integer> myList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenSeparate = myList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> oddEvenSet =  oddEvenSeparate.entrySet();
        for(Map.Entry<Boolean, List<Integer>> me : oddEvenSet){
            System.out.println("----------------------------------");
            if(me.getKey()){
                System.out.println("Even numbers : ");
            }
            else{
                System.out.println("Odd numbers : ");
            }
            System.out.println("----------------------------------");
            List<Integer> list = me.getValue();
            for(int i : list){
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
