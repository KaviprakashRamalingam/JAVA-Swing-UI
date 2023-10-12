/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author prashanth.baskar
 */


//created validations for employee name, age, email and phone number
public class Validations {
    
    JFrame frame;
    Constants constants = new Constants();
       
    
    public boolean validateIfFieldInputsNumberOnly(JTextField phoneNo)
    {
        boolean isPhoneNoValid = false;
        
        Pattern patternMobile = Pattern.compile(constants.RegularExpressionForNumericFields);
        Matcher matchRegexPhone = patternMobile.matcher(phoneNo.getText());
        
        if(matchRegexPhone.find()){
            isPhoneNoValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.wrongMobileNumberValueMessage);
        }
        return isPhoneNoValid;   
    }
    
    
    public boolean validateIfFieldInputsNumberOnly_Registered(JTextField phoneNo)
    {
        boolean isPhoneNoValid = false;
        
        Pattern patternMobile = Pattern.compile(constants.RegularExpressionForNumericFields);
        Matcher matchRegexPhone = patternMobile.matcher(phoneNo.getText());
        
        if(matchRegexPhone.find()){
            isPhoneNoValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.wrongRegisteredNumberValueMessage);
        }
        return isPhoneNoValid;   
    }
    
    
    public boolean validateIfFieldInputsNumberOnly_ZipCode(JTextField zipCode)
    {
        boolean isPhoneNoValid = false;
        
        Pattern patternMobile = Pattern.compile(constants.RegularExpressionForNumericFieldsforZipCode);
        Matcher matchRegexPhone = patternMobile.matcher(zipCode.getText());
        
        if(matchRegexPhone.find()){
            isPhoneNoValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.wrongzipCodeValueMessage);
        }
        return isPhoneNoValid;   
    }
    
    // Validation logic to ensure Email ID is entered in correct format by user
    public boolean validateIfEmailIDIsCorrect(JTextField txtEmailID){
        
        boolean isEmailIDValid = false;
        Pattern patternRegexEmail = Pattern.compile(constants.RegularExpressionForEmailValidation);
        Matcher matchRegexEmail = patternRegexEmail.matcher(txtEmailID.getText());

        if (matchRegexEmail.find())
        {
            isEmailIDValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.wrongEmailIDValueMessage);
        }
        return isEmailIDValid;
    }
    
    public boolean validateIfCharactersOnly(JTextField text){
        boolean isAlphabet = false;
        Pattern patternRegexChar = Pattern.compile(constants.RegularExpressionForCharacterOnly);
        Matcher matchRegexChar = patternRegexChar.matcher(text.getText());
        
        if(matchRegexChar.find()){
            isAlphabet = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.shouldBeCharacterOnly);
        }
        
        return isAlphabet;
    }
    
    public boolean validateAge(JTextField age){
        boolean isCorrectAge = false;
        
        Pattern patternRegexAge = Pattern.compile(constants.RegularExpressionForAge);
        Matcher matchRegexAge = patternRegexAge.matcher(age.getText());
        
        if(matchRegexAge.find()){
            isCorrectAge = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constants.incorrectAge);
        }
        return isCorrectAge;
    }
}
