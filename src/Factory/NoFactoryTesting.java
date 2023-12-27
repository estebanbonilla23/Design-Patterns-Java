package Factory;

import  java.util.Scanner;

public class NoFactoryTesting {
    public static void main(String[] args){

        //bad implementation of factory
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship? (U / R)");

        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        } else if (enemyShipOption.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }

        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
