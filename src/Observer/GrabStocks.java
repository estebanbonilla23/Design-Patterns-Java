package Observer;

public class GrabStocks {
    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setAaplPrice(10);
        stockGrabber.setGoogPrice(12);
        stockGrabber.setIbmPrice(13.5);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setAaplPrice(11);
        stockGrabber.setGoogPrice(13);
        stockGrabber.setIbmPrice(14.5);

        stockGrabber.unregister(stockObserver1);

        stockGrabber.setAaplPrice(12);
        stockGrabber.setGoogPrice(14);
        stockGrabber.setIbmPrice(15);

        Runnable getIBM = new GetTheStock(stockGrabber, 2,"IBM", 197.00);
        Runnable getAAP = new GetTheStock(stockGrabber, 2,"AAP", 198.00);
        Runnable getGOO = new GetTheStock(stockGrabber, 2,"GOO", 199.00);

        new Thread(getIBM).start();
        new Thread(getAAP).start();
        new Thread(getGOO).start();
    }
}
