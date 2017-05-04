package login.diary.tinyefforts.androidapplication_diarylogin.beanclasses;

import java.util.InputMismatchException;

import login.diary.tinyefforts.androidapplication_diarylogin.exceptions.InvalidInputException;

/**
 * Created by Ravi Teja on 04-05-2017.
 */

public class ValidationUtils {

    public static boolean validateUserSignup(UserSignup userSignup) throws InputMismatchException,
            InvalidInputException, NullPointerException {
        boolean flag = false;

        if(userSignup != null) {
            if (!userSignup.getPassword().matches(userSignup.getConfirmPassword())) {
                throw new InputMismatchException();
            } else if (userSignup.getUserName().trim().matches("") || userSignup.getUserName().length() < 8) {
                throw new InvalidInputException("Username");
            } else if (userSignup.getEmailId().trim().matches("")) {
                throw new InvalidInputException("E-mail ID");
            } else if (userSignup.getPassword().trim().matches("")) {
                throw new InvalidInputException("Password");
            } else if ((userSignup.getMobileNum() / 1000000000) > 9) {
                throw new InvalidInputException("Password");
            }
        }
        else
            throw new NullPointerException("User Signup Details cannot be Null/Empty");


        return flag;
    }

}
