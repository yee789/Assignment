package registration;

import AddMenu.*;

public class Register implements RegisterInterface {

    private String contactNo;
    private String address;
    private String email;
    private String userid;
    private String companyName;
    private String password;

    public Register() {
        this.contactNo = "";
        this.address = "";
        this.email = "";
        this.userid = "";
        this.companyName = "";
        this.password = "";
    }

    public Register(String userid, String companyName, String password ,String email,String contactNo, String address) {
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.userid = userid;
        this.companyName = companyName;
        this.password = password;
    }

    @Override
    public String getUserId() {
        return userid;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getContactNo() {
        return contactNo;
    }

    @Override
    public void setUserId(String id) {
        this.userid = id;
    }

    @Override
    public void setCompanyName(String Cname) {
        this.companyName = Cname;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setContactNo(String ContactNo) {
        this.contactNo = ContactNo;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
