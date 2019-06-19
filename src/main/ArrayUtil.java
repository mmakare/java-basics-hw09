import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here
        Set<String> s = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        for (int i = 0; i < array1.length; i++) {
            if (!s.add(array1[i])) {
                System.out.println("Duplicate detected: " + array1[i]);
                s2.add(array1[i]);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (!s.add(array2[i])) {
                System.out.println("Duplicate detected: " + array2[i]);
                s2.add(array2[i]);
            }
        }

        String[] ListOfDuplicates = s2.toArray(new String[s2.size()]);
        System.out.println(Arrays.toString(ListOfDuplicates));

        return ListOfDuplicates;
    }
}