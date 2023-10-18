package model;

public class Contact {

    private String salutation;
    private String lastName;
    private String phone;

    public Contact(String salutation, String lastName, String phone) {
        this.salutation = salutation;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
