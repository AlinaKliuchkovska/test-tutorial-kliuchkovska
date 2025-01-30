package utils;

import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class Utils {
    public static void writeResultToFile(Map<String, Integer> result) {
        try (FileWriter writer = new FileWriter("duplicate_counts.txt")) {
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
            }
            log.info("Results written to duplicate_counts.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
