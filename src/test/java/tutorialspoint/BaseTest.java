package tutorialspoint;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import test_data.TestData;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    static ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    protected static TestData testData;

    static {
        try {
            testData = mapper.readValue(new File("src/main/resources/TestData.yaml"), TestData.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    @BeforeEach
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
        Selenide.open(testData.BASE_URL);
    }
}
