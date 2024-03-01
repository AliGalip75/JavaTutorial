package BoxingGame;
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,100,80,100);
        Fighter f2 = new Fighter("B",15,85,75,50);

        Match match = new Match(f1,f2,70,90);
        match.run();
    }
}
