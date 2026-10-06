    public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private long zipCode;
    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public long getZipCode() { return zipCode; }
    public String toString() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }
}
