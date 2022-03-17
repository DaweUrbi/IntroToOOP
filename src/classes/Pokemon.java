package classes;

// blueprint (template)
public class Pokemon {

    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor - a method to create an instance (object)
    // - default constructor: no parameters
    // - default constructor is given by the java compiler if you don't have any constructor
    Pokemon() {
        // nul keyword - refers to an empty object (uninitialized object)
        this.name = null;
        this.type = null;
        this.healthPoint = 0;
        this.attackPoint = 0;
    }

    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        // initialize your fields
        // 'this' (optional); self reference
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }
    // methods (behaviours) - functions
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged the attack!");
         } else {
            System.out.println("I am attacking you with " + attackPoint);
            enemy.healthPoint -= attackPoint;
        }
    }

    boolean dodge() {
        //random number fro, 0.0-1.0; > 0.5 = True, <= 0.5 = False
        return Math.random() > 0.5;
    }

    void evolve() {
        System.out.println("I am evolving...");
        healthPoint += 20;
        attackPoint += 20;
    }
}
