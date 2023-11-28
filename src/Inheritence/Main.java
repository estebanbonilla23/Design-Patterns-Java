package Inheritence;

public class Main {
    public static void main(String[] args) {

        Dog fido = new Dog();
        Animal doggy = new Dog();
        fido.setName("Fido");

        System.out.println(fido.getSound());
        System.out.println(doggy.getSound());

        fido.digHole();
        //doggy.digHole(); undefined
        ((Dog)doggy).digHole();

        fido.setWeight(10.5);
    }
}