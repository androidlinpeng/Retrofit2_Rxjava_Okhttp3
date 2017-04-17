package msgcopy.com.retrofit2.model;

public class UserEntity {

    /**
     * username : kaoke_866499020005556
     * first_name : kaoke_866499020005556
     * last_name :
     * is_active : true
     * id : 505
     * is_superuser : false
     * is_staff : false
     * last_login : 2017-04-06T10:01:13
     * password : pbkdf2_sha256$10000$afZjdpXRomHo$4FYi2zHQK/InrrtXKg0Nn4C49s313XLTuwGiO66rGcc=
     * email :
     * date_joined : 2016-10-08T14:41:02
     */

    private String username;
    private String first_name;
    private String last_name;
    private boolean is_active;
    private int id;
    private boolean is_superuser;
    private boolean is_staff;
    private String last_login;
    private String password;
    private String email;
    private String date_joined;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_superuser() {
        return is_superuser;
    }

    public void setIs_superuser(boolean is_superuser) {
        this.is_superuser = is_superuser;
    }

    public boolean isIs_staff() {
        return is_staff;
    }

    public void setIs_staff(boolean is_staff) {
        this.is_staff = is_staff;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }
}
