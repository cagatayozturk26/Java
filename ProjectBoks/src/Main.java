public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Selim Emre GÜNAY",50,250,75,70,70);
        Fighter f2 = new Fighter("Selman Erdem GÜNAY",60,300,80,35,35);

        Ring r = new Ring(f1,f2,75,80);
        r.run();
    }
}