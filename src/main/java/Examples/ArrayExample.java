package Examples;

import java.util.Arrays;

public class ArrayExample {

    public static String[] removeDuplicates(String[] array) {
        String[] result = Arrays.stream(array)
                .distinct()
                .toArray(String[]::new);

        return result;

        //        Set<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(array));
        //        String[] result = new String[uniqueSet.size()];
        //        uniqueSet.toArray(result);
        //        return result;
    }
}
