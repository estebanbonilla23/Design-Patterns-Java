package Factory;

import java.util.Scanner;

public class FactoryTesting {
    public static void main(String[] args){

        //better implementation of factory
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? (U / R / B)");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }else{
            System.out.println("Wrong option!");
        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
