package Strategy;

import Inheritence.Animal;

public class Bird extends Animal {

    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
