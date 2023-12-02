package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void regisster(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        int observerIndex = observers.indexOf(obs);
        System.out.println("Observe: "+observerIndex+1 +" deleted");
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer observe: observers){
            observe.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
