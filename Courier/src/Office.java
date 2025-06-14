// Офис – Singleton
public class Office {
    private static Office office;

    private Office() {}

    public static Office getOffice() {
        if (office == null) {
            office = new Office();
        }
        return office;
    }

    public Parcel createParcel(String city, String country) {
        return ParcelFactory.createParcel(city, country);
    }
}
