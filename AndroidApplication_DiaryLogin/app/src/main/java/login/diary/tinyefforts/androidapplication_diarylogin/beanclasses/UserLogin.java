package login.diary.tinyefforts.androidapplication_diarylogin.beanclasses;

/**
 * Created by Ravi Teja on 03-05-2017.
 */

public class UserLogin {

    private String userName;
    private String password;

    public UserLogin(String userName, String password){
        this.setUserName(userName);
        this.setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
