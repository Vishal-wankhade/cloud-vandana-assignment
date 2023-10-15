import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(originalArray));

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}