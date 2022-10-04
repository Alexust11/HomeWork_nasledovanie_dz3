public class Main {
    public static void main(String[] args) {
        Herbivores horse = new Herbivores("Лошадь", 3, "Суша-подсобное хозяйсто", 4, "растительная пища");
        horse.eat();
        horse.go();
        horse.graze();
        Herbivores giraffe = new Herbivores("Жираф", 4, "саванна", 4, "кустарники, трава");
        Herbivores gazelle = new Herbivores("Газель", 3, "Лес", 15, "трава");
        System.out.println(horse);
        System.out.println(giraffe);
        System.out.println(gazelle);
        System.out.println();

        System.out.println(gazelle.equals(giraffe));

        System.out.println("________________________________________________________________________");
        Amphibians frog = new Amphibians("Лягушка", 1, "Болото");
        frog.hunting();
        frog.eat();
        Amphibians snakeAlready = new Amphibians("Уж пресноводный", 2, "пресноводные водоемы");
        System.out.println(frog);
        System.out.println(snakeAlready);
        snakeAlready.hunting();
        System.out.println("________________________________________________________________________");
        Predators hiena = new Predators("Гиена", 2, "джунгли", 10, "мясо");
        Predators tigr = new Predators("тигр", 6, "савана", 20, "мясо");
        Predators bear = new Predators("медведь", 10, "лес", 15, "мясо");
        System.out.println(hiena);
        System.out.println(tigr);
        System.out.println(bear);
        tigr.hunting();
        tigr.walk();
        tigr.sleep();
        System.out.println("________________________________________________________________________");

        Flightless peacock = new Flightless("павлин", 2, "степь", "шагает");
        Flightless penguin = new Flightless("пингвин", 3, "береговая линия", "шагает, плавает");
        Flightless dodo = new Flightless("птица додо", 2, "тропики", "бегает");
        dodo.eat();
        dodo.sleep();

        System.out.println("________________________________________________________________________");
        Flying seagull = new Flying("чайка", 1, "береговая линия", "летает");
        Flying albatross = new Flying("альбатрос", 2, "береговая линия","летает");
        Flying falcon = new Flying("сокол", 3, "скалы, воздух", "летает");
        falcon.eat();
        falcon.flying();
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}