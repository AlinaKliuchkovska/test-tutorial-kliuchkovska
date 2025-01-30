package tutorialspoint;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static utils.DuplicateStringCounter.countDuplicates;
import static utils.Utils.writeResultToFile;

public class DuplicateStringCounterTests {
    @Test
    public void duplicateStringCounterTest() {
        List<String> sampleList = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> result = countDuplicates(sampleList);
        writeResultToFile(result);
    }
}
