package Strategy;

import Inheritence.Animal;
import Inheritence.Dog;

public class Main {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweet = new Bird();
        Animal babyTweet = new BabyBird();

        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Bird: "+tweet.tryToFly());
        System.out.println("BabyBird: "+babyTweet.tryToFly());

        babyTweet.setFlyingTypeAbility(new ItFlys());
        System.out.println("Bird: "+babyTweet.tryToFly());
    }
}