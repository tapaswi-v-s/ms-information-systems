# Lab Assignment - 3

### Problem Definition
#### Create a Java Swing Application for entering Patient Details 

Patient registration form and display patient details in separate panel. Required fields:
* first name, last name, age, email, message (text box) 
* A field for dropdown comboBox (patient type) 
* A field for radio button (gender/ etc.)
* Photo(Image)


#### Screenshots folder
1. [Patient Registration Form - with Date Chooser](screenshots/registration_form_with_date_chooser.png)
   * Notice that the age will be auto-calculated based on the selected date.
2. [View Details Screen](screenshots/view_details_screen_with_back_button.png)
   * Notice that the Title Label, which is in the _Parent Split Pane_ of Card Layout, has changed to __"Patient Details"__. 
   * On clicking back button, user will go back to registration form and the label will again change to **"Patient Registration Form"**.
3. [Date Chooser control](screenshots/jDateChooser.png)
   * Used the JCalendar library.
4. [Validation Errors](screenshots/validation_errors.png)
    * Validation errors will be compiled based on every missing detail.
5. [Age Validation Error](screenshots/age_error.png)
   * For this example the hospital is not accepting patients below 5 years and above 100 years.😜

### _patient-registration_ folder
Java Swing project for patient registration.