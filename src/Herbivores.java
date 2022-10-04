import java.util.Objects;

public class Herbivores extends Mammals{
    // класс травоядные
    String typeFood;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        if (typeFood!=null && !typeFood.isBlank()&&!typeFood.isEmpty()) {
            this.typeFood = typeFood;
        } else {this.typeFood = "Не задано";
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores that)) return false;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void graze() {
        System.out.println(name+ " пасётся");
    }

    @Override
    public String toString() {
        return "Травоядное {" +
                " имя='" + name + '\'' +
                ", тип питания='" + typeFood + '\'' +
                ", скорость=" + speed +
                ", возраст=" + age +
                ", среда обитания='" + livingEnvironment + '\'' +
                '}';
    }
}
