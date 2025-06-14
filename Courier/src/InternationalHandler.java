// Разпределя колети за чужбина
public class InternationalHandler extends Handler {
    @Override
    public void processParcel(Parcel parcel) {
        if (!parcel.getCountry().equalsIgnoreCase("Bulgaria")) {
            if (Country.isValidCountry(parcel.getCountry())) {
                System.out.println("Пратката е предназначена за доставка в чужбина.");
                System.out.println("------------------------");
            } else {
                System.out.println("Държавата \"" + parcel.getCountry() + "\" не е валидна.");
            }
        } else {
            System.out.println("Грешка!");
        }
    }
}
