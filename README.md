# FinTech Financial QA Automation Project

A hybrid Cucumber BDD, Selenium Java, and RestAssured API test automation framework designed to validate mortgage calculation functionality and backend endpoints on financial web applications.

---

### **Tech Stack**
* **Language:** Java 21
* **UI Automation Tool:** Selenium WebDriver
* **API Automation Tool:** RestAssured
* **BDD Framework:** Cucumber (Gherkin)
* **Test Runner:** TestNG
* **Design Pattern:** Page Object Model (POM)
* **Build Tool:** Apache Maven
* **CI/CD Pipelines:** Jenkins & GitHub Actions

---

### **Project Structure**
```text
Fntech-Financial-QA-Automation
│
├── .github
│   └── workflows
│       └── maven.yml                     # GitHub Actions CI/CD configuration
│
├── src/test/java/com/fintech/qa
│   ├── api
│   │   └── MortgageApiTests.java         # RestAssured API test validation
│   ├── pages
│   │   └── MortgagePage.java             # Page elements & actions (POM)
│   ├── stepdefinitions
│   │   └── MortgageSteps.java            # Step implementations binding Gherkin to Selenium
│   ├── runners
│   │   └── TestRunner.java               # TestNG Cucumber runner
│   └── utils
│       └── DriverManager.java            # WebDriver lifecycle management
│
└── src/test/resources
    └── features
        └── MortgageCalculator.feature    # BDD feature files written in Gherkin
        

                                                                      