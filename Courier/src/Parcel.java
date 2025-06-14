// Клас Parcel със city и country
public class Parcel {
    private String city;
    private String country;

    public Parcel(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void showInfo() {
        System.out.println("-- АДРЕС НА ПОЛУЧАТЕЛ –– \r\n Град: " + city + ", Държава: " + country);
    }

}
