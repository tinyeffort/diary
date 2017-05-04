package login.diary.tinyefforts.androidapplication_diarylogin.exceptions;

/**
 * Created by Ravi Teja on 03-05-2017.
 */

public class InvalidInputException extends Exception {

    private String input;

    public InvalidInputException(String input){
        this.input = input;
    }

    @Override
    public String toString() {
        return (this.input+" not Entered Properly");
    }

}
