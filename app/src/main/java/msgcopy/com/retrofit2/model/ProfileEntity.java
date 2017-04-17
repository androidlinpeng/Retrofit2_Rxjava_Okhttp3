package msgcopy.com.retrofit2.model;

/**
 * Created by liang on 2017/4/17.
 */

public class ProfileEntity {

    /**
     * username : kaoke_000000000000000
     * openid :
     * first_name : kaoke_000000000000000
     * last_name :
     * uid :
     * city : null
     * prov : null
     * company : null
     * birthday : null
     * wx_openid :
     * gender : false
     * qrpath : null
     * email :
     * mood : null
     */

    private String username;
    private String openid;
    private String first_name;
    private String last_name;
    private String uid;
    private Object city;
    private Object prov;
    private Object company;
    private Object birthday;
    private String wx_openid;
    private boolean gender;
    private Object qrpath;
    private String email;
    private Object mood;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getProv() {
        return prov;
    }

    public void setProv(Object prov) {
        this.prov = prov;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getWx_openid() {
        return wx_openid;
    }

    public void setWx_openid(String wx_openid) {
        this.wx_openid = wx_openid;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Object getQrpath() {
        return qrpath;
    }

    public void setQrpath(Object qrpath) {
        this.qrpath = qrpath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getMood() {
        return mood;
    }

    public void setMood(Object mood) {
        this.mood = mood;
    }
}
