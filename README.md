# FinTech Financial QA Automation Project

A Cucumber BDD and Selenium Java test automation framework designed to validate mortgage calculation functionality on financial web applications.

---

### **Tech Stack**
* **Language:** Java 21
* **Automation Tool:** Selenium WebDriver
* **BDD Framework:** Cucumber (Gherkin)
* **Test Runner:** TestNG
* **Design Pattern:** Page Object Model (POM)
* **Build Tool:** Apache Maven

---

### **Project Structure**
```text
Fntech-Financial-QA-Automation
│
├── src/test/java/com/fintech/qa
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
        
                                                                      