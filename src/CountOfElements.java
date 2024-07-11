import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOfElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 1};
        Map<Integer, Long> map = countOfElements(array);
        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }

    private static Map<Integer, Long> countOfElements(int[] elements) {
        return Arrays.stream(elements)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}
