package com.po;

public class User {
    private Integer userid;

    private String username;

    private String userpass;

    private String userboth;

    private String code;

    private String imgpath;

    private String email;

    private String joinin;

    private String ustate;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getUserboth() {
        return userboth;
    }

    public void setUserboth(String userboth) {
        this.userboth = userboth == null ? null : userboth.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getJoinin() {
        return joinin;
    }

    public void setJoinin(String joinin) {
        this.joinin = joinin == null ? null : joinin.trim();
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate == null ? null : ustate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpass=").append(userpass);
        sb.append(", userboth=").append(userboth);
        sb.append(", code=").append(code);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", email=").append(email);
        sb.append(", joinin=").append(joinin);
        sb.append(", ustate=").append(ustate);
        sb.append("]");
        return sb.toString();
    }
}