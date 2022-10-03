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



    }
}