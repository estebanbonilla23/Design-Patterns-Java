package Inheritence;

abstract public class Creature {
    protected String name;
    protected double weigth;
    protected String sound;

    public abstract double getWeigth();

    public abstract void setWeigth(double weigth);

    public abstract String getSound();

    public abstract void setSound(String sound);

    public abstract void setName(String newName);
    public abstract String getName();
}
