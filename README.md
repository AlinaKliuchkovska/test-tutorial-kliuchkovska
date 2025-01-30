Overview

This project is a test automation framework using JUnit 5 and Selenide for UI testing.
The framework loads dynamic test data from a YAML file and provides utilities for common test operations.

It includes:

Base test setup (BaseTest)
Category selection test (CategoryTests)
Duplicate string counter test (DuplicateStringCounterTests)

Prerequisites

Before running the tests, ensure you have the following installed:
Java 11 or later
Maven 3.6+
An IDE (e.g., IntelliJ IDEA, Eclipse)
A web browser and its corresponding WebDriver (Chrome, Firefox, etc.)

Configuration

Test data is stored in a YAML file (src/main/resources/TestData.yaml):
The browser window is set to 1920x1080.
The page load timeout is 60 seconds.
The BASE_URL is loaded from TestData.yaml.

Test Classes

BaseTest.java
Loads test data from TestData.yaml.
Configures Selenide and opens the base URL before each test.
CategoryTests.java
Navigates to a category and verifies the correct page loads.
DuplicateStringCounterTests.java
Counts duplicate strings in a list and writes results to a file.

Utility Methods

DuplicateStringCounter.java
Counts occurrences of each string in a list.
Utils.java
Writes the result to a file.

Conclusion

This framework provides a structured approach to UI testing using Selenide and JUnit 5. 
