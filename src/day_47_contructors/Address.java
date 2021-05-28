package day_47_contructors;

public class Address {

 private    String Street;
 private    String city;
 private    String state;
 private    String  zipCode;
 private    String country = "USA";
 /// constructor -automatically called
 public Address(){
     System.out.println("Address constructor");
     Street = "5738 erie st";
     city = "chicago";
     state = "illinois";
     zipCode = "60651";



 }
  public Address(String Street, String city, String state, String zipCode, String country){



  }

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
//        Street = street;
//        if (Street.isEmpty() || Street.length()>50){
//            System.out.println("Error: invalid street");
//        }else{
//            this.Street = Street;
////            //  setStreet(Street);
//

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
