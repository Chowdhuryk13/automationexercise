# Automation Exercise - Automated GUI Testing

![Website home page](https://www.automationexercise.com/images/logo.png)

## About This Project

The **Automation Exercise** project was created to practice test automation skills using the **Selenium (Java)** framework. The website under test is specifically designed for automated testing. Here are some key details:

- **Objective**: Practice test automation skills
- **Framework**: Selenium with Java
- **Course**: Based on skills learned from a course on the Udemy platform
- **Website**: [Automation Exercise](http://automationexercise.com)

## Project Features

- **Automated Tests**: The project contains a total of **26 automated tests**, created based on test cases defined by the site's developers.
- **Test Report**: After running and executing the tests, you can generate a detailed test report using the proper command.
- **Tools Used**:
  - **IntelliJ IDEA**
  - **Maven**
  - **Selenium WebDriver**
  - **TestNG**
  - **Allure Report**

## Project Design

The project follows these design principles:

- **Page Object Model**: Organizes test code into reusable page objects.
- **Fluent Interface**: Enhances readability by chaining methods.
- **Data-Driven Approach**: Utilizes data-driven testing techniques.
- **Behavior-Driven Approach**: Aligns tests with business requirements.

## Important Notes

- **Test Environment**: The tests have been run in **Firefox** in private mode (which blocks ads). However, due to pop-up ads that require closing, the tests may not work in other browsers.
- **Stability**: Tests are not always stable because ads are not always completely blocked.
- **Allure Report**: To generate the Allure Report:
  1. Install Allure Commandline: `npm install -g allure-commandline --save-dev`
  2. Generate the report: `allure serve target/allure-results`

## Available Test Cases

### Test Case 1: Register User
1. Launch the browser.
2. Navigate to the URL: [Automation Exercise](http://automationexercise.com).
3. Verify that the home page is visible successfully.
4. Click on the 'Signup / Login' button.
5. Verify that 'New User Signup!' is visible.
6. Enter name and email address.
7. Click the 'Signup' button.
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible.
9. Fill in details: Title, Name, Email, Password, Date of birth.
10. Select the checkbox 'Sign up for our newsletter!'.
11. Select the checkbox 'Receive special offers from our partners!'.
12. Fill in additional details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number.
13. Click the 'Create Account' button.
14. Verify that 'ACCOUNT CREATED!' is visible.
15. Click the 'Continue' button.
16. Verify that 'Logged in as username' is visible.
17. Click the 'Delete Account' button.
18. Verify that 'ACCOUNT DELETED!' is visible and click the 'Continue' button.

### Test Case 2: Login User with Correct Email and Password
1. Launch the browser.
2. Navigate to the URL: [Automation Exercise](http://automationexercise.com).
3. Verify that the home page is visible successfully.
4. Click on the 'Signup / Login' button.
5. Verify that 'Login to your account' is visible.
6. Enter the correct email address and password.

---

Feel free to customize this README according to your project's specific needs. Happy testing! 🚀🔍🌟

---

**GitHub Repository**: [AutomationExercise](https://github.com/RobertGitH/AutomationExercise) ¹¹: [GitHub - RobertGitH/AutomationExercise](https://github.com/RobertGitH/AutomationExercise)

Source: Conversation with Bing, 3/20/2024
(1) Automation Exercise - GitHub. https://github.com/RobertGitH/AutomationExercise.
(2) GitHub - vagwada/selenium-java: Exercises in automation with Selenium .... https://github.com/vagwada/selenium-java.
(3) Learn Selenium with Java to run Automated Tests | BrowserStack. https://www.browserstack.com/guide/selenium-with-java-for-automated-test.
(4) GitHub - katejay/Selenium-Exercise: Selenium WebDriver with Java from .... https://github.com/katejay/Selenium-Exercise.
(5) undefined. http://automationexercise.com.
(6) undefined. https://www.autoitscript.com/site/autoit/downloads/.
