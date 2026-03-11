
# Automation-Exercise-Assignment
## Test Automation using Selenium WebDriver + TestNG + Java
This project contains test automation for AutomationExercise.com which validates the core user authentication and basic website functionality, built using Java, Selenium, TestNG, Maven. After running and executing the tests, a html test report can be generated, which describes the statuses of each test.

The suite automates all 10 test cases provided in the functional requirement specification document. 

 **Tools:**
+ Eclipse
+ Maven
+ Selenium WebDriver
+ TestNG
+ Extent Report

**Project Structure** 

<img width="816" height="1002" alt="Screenshot 2026-03-11 114048" src="https://github.com/user-attachments/assets/2a930aff-a401-47fa-9559-96ff3c689f1f" />

# Reports 

**Extent Reports** 

<img width="1888" height="1062" alt="Screenshot 2026-03-09 160817" src="https://github.com/user-attachments/assets/6acfd8aa-e32b-4e08-81e9-71f6cad8dd61" />

**TestNG Report** 

<img width="1915" height="1040" alt="Screenshot 2026-03-09 151157" src="https://github.com/user-attachments/assets/da197553-0e7a-4227-8525-854b3d098b29" />

The project includes all available test cases:
### :white_check_mark: Test Case 1: Register User
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Signup / Login' button </ol>
<ol> 5. Verify 'New User Signup!' is visible </ol>
<ol> 6. Enter name and email address </ol>
<ol> 7. Click 'Signup' button </ol>
<ol> 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible </ol>
<ol> 9. Fill details: Name, Email, Password, Date of birth </ol>
<ol> 10. Select checkbox 'Sign up for our newsletter!' </ol>
<ol> 11. Select checkbox 'Receive special offers from our partners!' </ol>
<ol> 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number </ol>
<ol> 13. Click 'Create Account button' </ol>
<ol> 14. Verify that 'ACCOUNT CREATED!' is visible </ol>
<ol> 15. Click 'Continue' button </ol>
<ol> 16. Verify that 'Logged in as username' is visible </ol>
<ol> 17. Click 'Delete Account' button </ol>
<ol> 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button </ol>

---

### :white_check_mark: Test Case 2: Login User with correct email and password
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Signup / Login' button </ol>
<ol> 5. Verify 'Login to your account' is visible </ol>
<ol> 6. Enter correct email address and password </ol>
<ol> 7. Click 'login' button </ol>
<ol> 8. Verify that 'Logged in as username' is visible </ol>

---

### :white_check_mark: Test Case 3: Login User with incorrect email and password
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Signup / Login' button </ol>
<ol> 5. Verify 'Login to your account' is visible </ol>
<ol> 6. Enter incorrect email address and password </ol>
<ol> 7. Click 'login' button </ol>
<ol> 8. Verify error 'Your email or password is incorrect!' is visible </ol>

---

### :white_check_mark: Test Case 4: Logout User
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Signup / Login' button </ol>
<ol> 5. Verify 'Login to your account' is visible </ol>
<ol> 6. Enter correct email address and password </ol>
<ol> 7. Click 'login' button </ol>
<ol> 8. Verify that 'Logged in as username' is visible </ol>
<ol> 9. Click 'Logout' button </ol>
<ol> 10. Verify that user is navigated to login page </ol>

---

### :white_check_mark: Test Case 5: Register User with existing email
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Signup / Login' button </ol>
<ol> 5. Verify 'New User Signup!' is visible </ol>
<ol> 6. Enter name and already registered email address </ol>
<ol> 7. Click 'Signup' button </ol>
<ol> 8. Verify error 'Email Address already exist!' is visible </ol>

---

### :white_check_mark: Test Case 6: Contact Us Form
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Contact Us' button </ol>
<ol> 5. Verify 'GET IN TOUCH' is visible </ol>
<ol> 6. Enter name, email, subject and message </ol>
<ol> 7. Upload file </ol>
<ol> 8. Click 'Submit' button </ol>
<ol> 9. Click OK button </ol>
<ol> 10. Verify success message 'Success! Your details have been submitted successfully.' is visible </ol>
<ol> 11. Click 'Home' button and verify that landed to home page successfully </ol>

---

### :white_check_mark: Test Case 7: Verify Test Cases Page
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Test Cases' button </ol>
<ol> 5. Verify user is navigated to test cases page successfully </ol>

---

### :white_check_mark: Test Case 8: Verify All Products and product detail page
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Products' button </ol>
<ol> 5. Verify user is navigated to ALL PRODUCTS page successfully </ol>
<ol> 6. The products list is visible </ol>
<ol> 7. Click on 'View Product' of first product </ol>
<ol> 8. User is landed to product detail page </ol>
<ol> 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand </ol>

---

### :white_check_mark: Test Case 9: Search Product
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Click on 'Products' button </ol>
<ol> 5. Verify user is navigated to ALL PRODUCTS page successfully </ol>
<ol> 6. Enter product name in search input and click search button </ol>
<ol> 7. Verify 'SEARCHED PRODUCTS' is visible </ol>
<ol> 8. Verify all the products related to search are visible </ol>

---

### :white_check_mark: Test Case 10: Verify Subscription in home page
<ol> 1. Launch browser </ol>
<ol> 2. Navigate to url 'http://automationexercise.com' </ol>
<ol> 3. Verify that home page is visible successfully </ol>
<ol> 4. Scroll down to footer </ol>
<ol> 5. Verify text 'SUBSCRIPTION' </ol>
<ol> 6. Enter email address in input and click arrow button </ol>
<ol> 7. Verify success message 'You have been successfully subscribed!' is visible </ol>
