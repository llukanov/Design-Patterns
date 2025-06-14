public class Main {
    public static void main(String[] args) {
        // Създаване на единствената инстанция на Office
        Office office = Office.getOffice();

        // Разпределяне
        Handler plovdiv = new PlovdivHandler();
        Handler bulgaria = new BulgariaHandler();
        Handler international = new InternationalHandler();

        plovdiv.setNextHandler(bulgaria);
        bulgaria.setNextHandler(international);

        // Създаване на колети (процеса по приемане)
        Parcel parcelOne = office.createParcel("Plovdiv", "Bulgaria");
        Parcel parcelTwo = office.createParcel("Sofia", "Bulgaria");
        Parcel parcelThree = office.createParcel("Berlin", "Germany");
        Parcel parcelFour = office.createParcel("Kidsj", "Uzbekistan");

        // Обработка на пратките
        parcelOne.showInfo();
        plovdiv.processParcel(parcelOne);

        parcelTwo.showInfo();
        plovdiv.processParcel(parcelTwo);

        parcelThree.showInfo();
        plovdiv.processParcel(parcelThree);

        parcelFour.showInfo();
        plovdiv.processParcel(parcelFour);
    }
}
