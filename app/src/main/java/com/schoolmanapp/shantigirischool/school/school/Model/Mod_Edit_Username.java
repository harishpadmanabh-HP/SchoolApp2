package com.schoolmanapp.shantigirischool.school.school.Model;

/**
 * Created by srishtiinnovative on 20/06/17.
 */

public class Mod_Edit_Username {


    /**
     * status : true
     * msg : Success
     * UserData : TestMail@gmail.com
     */

    private boolean status;
    private String msg;
    private String UserData;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserData() {
        return UserData;
    }

    public void setUserData(String UserData) {
        this.UserData = UserData;
    }
}
