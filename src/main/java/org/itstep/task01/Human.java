package org.itstep.task01;

public class Human {
    private String fullName;
    private String date0fBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    public Human() {
    }

    public Human(String fullName, String date0fBirth, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.date0fBirth = date0fBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate0fBirth() {
        return date0fBirth;
    }

    public void setDate0fBirth(String date0fBirth) {
        this.date0fBirth = date0fBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", date0fBirth='" + date0fBirth + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
