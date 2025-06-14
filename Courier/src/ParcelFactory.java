// Създаване на колети – Factory
public class ParcelFactory {

    public static Parcel createParcel(String city, String country) {
        return new Parcel(city, country);
    }
}
