/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author prashanth.baskar
 */
public class Constants {
    
    //labels 
    public String empName = "Employee Name";
    public String empID = "Employee ID";
    public String age = "Age";
    public String gender = "Gender";
    public String startDate = "Start Date";
    public String jobLevel = "Job Level";
    public String teamInfo = "Team Information";
    public String jobTitle = "Job Title";
    public String phoneNo = "Phone Number";
    public String emailID = "E-Mail ID";
    public String employeeImage = "Employee Image";
    
    //Dialog Box messages
    public String wrongMobileNumberValueMessage = "Incorrect Mobile Number format! Mobile number should have 10 digits and should not start with 0.";
    public String wrongRegisteredNumberValueMessage = "Incorrect Registered Number format! Registered number should have 10 digits and should not start with 0.";
    public String wrongzipCodeValueMessage = "Incorrect zipCode Number format! ZipCode should have 5 digits.";

    public String wrongEmailIDValueMessage = "Incorrect email address format! Please re-verify the entered format.";
    public String compulsoryFieldsNotFilledErrorMessage="Please enter all the fields to add details!";
    public String shouldBeCharacterOnly="Please do not add number or special character to this field";
    public String shouldBeCharacterOnly_for_driver="Please do not add special character to this field";
    public String incorrectAge="Incorrect Age!";
    
    
    //Regular expressions
    public String RegularExpressionForEmailValidation = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    public String RegularExpressionForNumericFields = "[1-9]\\d{9}";
    public String RegularExpressionForNumericFieldsforZipCode = "^[0-9]{5}(?:-[0-9]{4})?$";
    public String RegularExpressionForCharacterOnly = "^[a-zA-Z]*$";
    public String RegularExpressionForAge="^([0-9]|[1-9][0-9]|100)$";
}
