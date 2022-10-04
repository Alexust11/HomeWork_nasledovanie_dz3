public class Predators extends Mammals {
    // класс хищники
    String typeFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        if (typeFood!=null && !typeFood.isBlank()&&!typeFood.isEmpty()) {
            this.typeFood = typeFood;
        } else {this.typeFood = "Не задано";
        }
    }
    public  void hunting() {
        System.out.println(name+ " охотится");
    }

    @Override
    public String toString() {
        return "Хищник {" +
                " кличка='" + name + '\'' +
                ", тип питания='" + typeFood + '\'' +
                ", скорость=" + speed +
                ", возраст=" + age +
                ", среда обитания='" + livingEnvironment + '\'' +
                '}';
    }
}
