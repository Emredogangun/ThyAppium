package exampleData;

public class Passenger {

    private String tcNo;
    private String name;
    private String lastName;
    private String Phone;
    private String email;
    private String dateOfBirth;

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Passenger(String tcNo, String name, String lastName, String phone, String email, String dateOfBirth) {
        this.tcNo = tcNo;
        this.name = name;
        this.lastName = lastName;
        Phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
