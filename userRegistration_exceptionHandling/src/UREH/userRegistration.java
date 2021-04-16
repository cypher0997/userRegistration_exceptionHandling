package UREH;

import java.util.regex.*;
import java.util.Scanner;

public class userRegistration {


     /**
     * @method isValidFirstName Check the pattern for first name
     * this returns true/false based on the firstname test result
     */
    public void isValidFirstName() {

        final String myPattern = "^[A-Z]{1}[a-z]{2,10}$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        try{
                System.out.println("enter the correct userFirstName");
                Scanner sc = new Scanner(System.in);
                String FirstName = sc.nextLine();
                if (FirstName == null) {
                    throw new userException("give valid input , String is empty");
                }
                else if(!(Pattern.compile(myPattern)).matcher(FirstName).matches()) {
                    /*if exception occurs below custom exception will handle it*/
                    throw new userException("give valid input");
                }
            System.out.println("the User FirstName is:" + FirstName);
        } catch(userException e) {

                String printMessage = e.warning;
                System.out.println(printMessage);
                isValidFirstName();
        }
        
    }

     /**
     * @method isValidLastName Check the pattern for Last name
     * this returns true/false based on the firstname test result
     */
    public void isValidLastName() {

        final String myPattern = "^[A-Z]{1}[a-z]{2,10}$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        try{
                System.out.println("enter the correct userLastName");
                Scanner sc = new Scanner(System.in);
                String LastName = sc.nextLine();
                if (LastName == null) {
                    throw new userException("give valid input , String is empty");
                }
                else if(!(Pattern.compile(myPattern)).matcher(LastName).matches()) {
                     /*if exception occurs below custom exception will handle it*/
                    throw new userException("give valid input");
                }
                System.out.println("the User lastname is:" + LastName);

        }catch(userException e) {

                String printMessage = e.warning;
                System.out.println(printMessage);
                isValidLastName();
        }
        
    }

    /**
     * @method isValidLastName Check the pattern for first name
     * this returns true/false based on the firstname test result
     */
    public void isValidemail() {

        final String myPattern = "^[a-z0-9]{3,}(.[0-9a-z]+)*@[a-z]{2,}.(com|edu)(co.in)*$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        try{
                System.out.println("enter the correct userEmail");
                Scanner sc = new Scanner(System.in);
                String Email = sc.nextLine();
                if (Email == null) {
                    throw new userException("give valid input , String is empty");
                }
                else if(!(Pattern.compile(myPattern)).matcher(Email).matches()) {
                     /*if exception occurs below custom exception will handle it*/
                    throw new userException("give valid input");
                }
                System.out.println("the User email is:" + Email);

        } catch(userException e) {

                String printMessage = e.warning;
                System.out.println(printMessage);
                isValidemail();
        }
        
    }

     /**
     * @method isValidLastName Check the pattern for first name
     * this returns true/false based on the firstname test result
     */
    public void isValidMobileNumber() {

        final String myPattern = "^\\+[0-9]+\\s[0-9]{10,15}$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        try{
                System.out.println("enter the correct userMobileNumber");
                Scanner sc = new Scanner(System.in);
                String MobileNumber = sc.nextLine();
                if (MobileNumber == null) {
                    throw new userException("give valid input , String is empty");
                }
                else if(!(Pattern.compile(myPattern)).matcher(MobileNumber).matches()) {
                     /*if exception occurs below custom exception will handle it*/
                    throw new userException("give valid input");
                }
                System.out.println("the User mobilenumber is:" + MobileNumber);

        } catch(userException e) {

                String printMessage = e.warning;
                System.out.println(printMessage);
                isValidMobileNumber();
        }
        
    }

     /**
     * @method isValidLastName Check the pattern for first name
     * this returns true/false based on the firstname test result
     */
    public void isValidPassword() {

        final String myPattern = "^(?=.*[0-9])"+"(?=.*[@#$%^&+=])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=\\S+$).{8,20}$";
        /**
         * @param myPattern contain the correct pattern for First name and last name
         */
        try{
                System.out.println("enter the correct user Password");
                Scanner sc = new Scanner(System.in);
                String Password = sc.nextLine();
                if (Password == null) {
                    throw new userException("give valid input , String is empty");
                }
                else if(!(Pattern.compile(myPattern)).matcher(Password).matches()) {
                     /*if exception occurs below custom exception will handle it*/
                    throw new userException("give valid input");
                }
                System.out.println("the User password is:" + Password);

        } catch(userException e) {

                String printMessage = e.warning;
                System.out.println(printMessage);
                isValidPassword();
        }
        
    }
}
