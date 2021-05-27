package day_47_contructors;

public class Address {

 private    String Street;
 private    String city;
 private    String state;
 private    String  zipCode;
 private    String country = "USA";

 @Override
        public  String toString(){
            return Street + ", "+city+", "+state+" "+zipCode;
        }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCountry() {
        return country;
    }
}
