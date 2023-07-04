public class Fighter {
    String name;
    int demagePower;
    int health;
    int weight;
    double dodgeRate;
    double criticalRate;

    Fighter(String name, int demagePower, int health, int weight, double dodgeRate, double criticalRate) {
        this.name = name;
        this.demagePower = demagePower;
        this.health = health;
        this.weight = weight;
        this.dodgeRate = dodgeRate;
        this.criticalRate = criticalRate;
    }

    int hit(Fighter foe,int power) {
        System.out.println(this.name + " " + power + " hasar vurdu.");
        if (foe.health - power <= 0)
            return 0;
        if (dodge(foe)) {
            System.out.println(foe.name + " gelen hasarı savurdu !!! ");
            return foe.health;
        } else
            return foe.health - power;
    }

    public boolean dodge(Fighter foe) {
        double randomValue = Math.random() * 100;
        return randomValue <= foe.dodgeRate;
    }

    public boolean critical() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.criticalRate;
    }
}
