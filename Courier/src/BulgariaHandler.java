// Разпределя колети за България
public class BulgariaHandler extends Handler {
    @Override
    public void processParcel(Parcel parcel) {
        if (parcel.getCountry().equalsIgnoreCase("Bulgaria")) {
            System.out.println("Пратката е предназначена за доставка в България.");
            System.out.println("------------------------");
        } else if (nextHandler != null) {
            nextHandler.processParcel(parcel);
        }
    }
}
