// Разпределяне на колети – Chain of Responsibility
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processParcel(Parcel parcel);
}
