package Strategy;

import Inheritence.Animal;

public class BabyBird extends Animal {

    public BabyBird(){
        super();
        setSound("Tweet sweet");
        flyingType = new CantFlys();
    }
}
