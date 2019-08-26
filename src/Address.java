public class Address {

    private String Country;
    private String State;
    private String City;
    private String Street;
    private String PostalCode;

    public String getCountry() {
        return Country;
    }

    public Address(String country, String state, String city, String street, String postalCode) {
        Country = country;
        State = state;
        City = city;
        Street = street;
        PostalCode = postalCode;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address " +
                "Country  " + Country + '\n' +
                "State " + State + '\n' +
                "City " + City + '\n' +
                "Street " + Street + '\n' +
                "PostalCode " + PostalCode  ;
    }
}
