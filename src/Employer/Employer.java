package Employer;

public class Employer {
    private String fName;

    private String sName;

    private String position;

    private String email;

    private int phone;

    private int age;

    public Employer(String fName, String sName, String position, String email, int phone, int age) {
        this.fName = fName;
        this.sName = sName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
