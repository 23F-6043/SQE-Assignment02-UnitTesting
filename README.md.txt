# SQE Assignment 02 - Unit Testing Framework

## Project Information
- **Course:** Software Quality Engineering
- **Assignment:** Assignment 02 - Unit Test Automation
- **Team Members:**
  - Member 1: 23F-6043 (f236043@cfd.nu.edu.pk)
  - Member 2: Ahmad11764 (p233054@cfd.nu.edu.pk)

## Project Structure
unit-testing-demo/
├── src/
│   ├── main/java/com/sqe/assignment/
│   │   ├── Calculator.java
│   │   ├── GradeCalculator.java
│   │   └── StringValidator.java
│   └── test/
│       ├── java/com/sqe/assignment/
│       │   ├── CalculatorTest.java
│       │   ├── CalculatorDataDrivenTest.java
│       │   ├── GradeCalculatorTest.java
│       │   ├── StringValidatorTest.java
│       │   └── FastTestSuit.java
│       └── resources/
│           ├── calculator-test-data.csv.txt
│           ├── test-cases.xlsx.csv
│           └── junit-platform.properties
├── pom.xml
└── README.md

## Technologies Used
- Java 17
- JUnit 5
- Maven
- Apache POI (Excel)
- OpenCSV (CSV)
- JaCoCo (Code Coverage)

## How to Run

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=CalculatorTest
```

### Generate Coverage Report
```bash
mvn clean test jacoco:report
```

## Test Coverage
- Total Tests: 35+
- Code Coverage: 90%+
- Test Techniques: ECP, BVA

## Team Contributions

### Member 1 (23F-6043)
- Calculator class implementation
- Calculator unit tests (12 tests)
- CSV data-driven tests
- Parallel execution configuration
- Maven configuration

### Member 2 (Ahmad11764)
- GradeCalculator class implementation
- StringValidator class implementation
- Unit tests for both classes (22 tests)
- Excel data-driven tests
- Documentation and README