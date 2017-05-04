package login.diary.tinyefforts.androidapplication_diarylogin.beanclasses;

/**
 * Created by Ravi Teja on 03-05-2017.
 */

public class UserSignup {

    private String userName;
    private String emailId;
    private long mobileNum;
    private String password;
    private String confirmPassword;

    public UserSignup(String userName, String emailId, long mobileNum, String password, String confirmPassword) {
        this.setUserName(userName);
        this.setEmailId(emailId);
        this.setMobileNum(mobileNum);
        this.setPassword(password);
        this.setConfirmPassword(confirmPassword);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
