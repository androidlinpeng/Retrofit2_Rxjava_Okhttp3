package msgcopy.com.retrofit2.model;

/**
 * Created by liang on 2017/4/17.
 */

public class SignEntity {

    /**
     * master : {"username":"Android","first_name":"Android","last_name":""}
     */

    private MasterBean master;

    public MasterBean getMaster() {
        return master;
    }

    public void setMaster(MasterBean master) {
        this.master = master;
    }

    public static class MasterBean {
        /**
         * username : Android
         * first_name : Android
         * last_name :
         */

        private String username;
        private String first_name;
        private String last_name;

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

    }
}
