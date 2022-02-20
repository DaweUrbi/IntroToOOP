package Classes;

public class Driver {
    public static void main(String[] args) {
        //create an instance (object) of Pokemon
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 100, 50);
        Pokemon flareon = new Pokemon("Flareon", "Flame", 100, 60);

        System.out.println(pikachu.type);
        System.out.println(flareon.attackPoint);

        pikachu.evolve();
        flareon.evolve();
        System.out.println(pikachu.healthPoint);
        System.out.println(pikachu.attackPoint);

        System.out.println(flareon.dodge());

        System.out.println("Flareon HP: " + flareon.healthPoint);
        pikachu.attack(flareon);
        System.out.println("Flareon HP: " + flareon.healthPoint);
    }
}
