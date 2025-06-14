// Разпределя колети за Пловдив
public class PlovdivHandler extends Handler {
    @Override
    public void processParcel(Parcel parcel) {
        if (parcel.getCity().equalsIgnoreCase("Plovdiv") && parcel.getCountry().equalsIgnoreCase("Bulgaria")) {
            System.out.println("Пратката е предназначена за доставка в Пловдив.");
            System.out.println("------------------------");
        } else if (nextHandler != null) {
            nextHandler.processParcel(parcel);
        }
    }
}
