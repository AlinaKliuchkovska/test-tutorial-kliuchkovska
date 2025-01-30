package utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringCounter {
    public static Map<String, Integer> countDuplicates(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}