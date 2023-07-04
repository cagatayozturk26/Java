public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double start = 50;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight() {
        return ((f1.weight <= this.maxWeight && f1.weight >= this.minWeight) && (f2.weight <= this.maxWeight && f2.weight >= this.minWeight));
    }

    public boolean starter() {
        double randomValue = Math.random() * 100;
        return randomValue <= start;
    }

    public void run() {
        if (checkWeight()) {
            if (starter()) {
                int count = 1;
                while (f1.health > 0 && f2.health > 0) {
                    int f1power = f1.demagePower, f2power = f2.demagePower;
                    System.out.println("=============== " + count + ". RAUNT ===============");
                    if (f1.critical())
                        f1power = f1.demagePower * 2;

                    if (f2.critical())
                        f2power = f2.demagePower * 2;

                    f2.health = f1.hit(f2, f1power);
                    f1.health = f2.hit(f1, f2power);
                    System.out.println(f1.name + " kalan can \t\t: " + f1.health);
                    System.out.println(f2.name + " kalan can \t: " + f2.health);
                    count++;
                }
                if (f2.health == 0)
                    System.out.println("\n" + f1.name + " KAZANDI !!!");
                else if (f1.health == 0)
                    System.out.println("\n" + f2.name + " KAZANDI !!!");
            } else {
                int count = 1;
                while (f1.health > 0 && f2.health > 0) {
                    int f1power = f1.demagePower, f2power = f2.demagePower;
                    System.out.println("=============== " + count + ". RAUNT ===============");
                    if (f1.critical())
                        f1power = f1.demagePower * 2;

                    if (f2.critical())
                        f2power = f2.demagePower * 2;
                    f1.health = f2.hit(f1, f2power);
                    f2.health = f1.hit(f2, f1power);
                    System.out.println(f2.name + " kalan can \t: " + f2.health);
                    System.out.println(f1.name + " kalan can \t\t: " + f1.health);
                    count++;
                }
                if (f1.health == 0)
                    System.out.println("\n" + f2.name + " KAZANDI !!!");
                else if (f2.health == 0)
                    System.out.println("\n" + f1.name + " KAZANDI !!!");
            }

        } else
            System.out.println("Boksörlerin sikletleri uygun değil ! ");
    }
}

