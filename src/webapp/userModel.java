package webapp;

public class userModel {
        String fname, lname, uname;
        String ename;
        int age, id;
        char gender;
        boolean reciveEmail;
        String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public boolean isReciveEmail() {
            return reciveEmail;
        }

        public void setReciveEmail(boolean reciveEmail) {
            this.reciveEmail = reciveEmail;
        }

        public void setPass(String pass){this.pass = pass;}

        public String getPAss(){return pass;}

}
