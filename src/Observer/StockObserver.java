package Observer;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New observer "+this.observerId);
        stockGrabber.regisster(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }
    public void printThePrices(){
        System.out.println(observerId + " IBM: "+ ibmPrice + " AAP: "+ aaplPrice + " GOOGLE: "+ googPrice);
    }
}
