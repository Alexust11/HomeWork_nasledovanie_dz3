public class Flightless  extends  Birds{
    //класс нелетающие
    String typeMovement;// тип перемещения

    public Flightless(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        if (typeMovement!=null && !typeMovement.isBlank()&&!typeMovement.isEmpty()) {
            this.typeMovement = typeMovement;
        } else {this.typeMovement = "Не задано";}

    }
    public void walk() {
        System.out.println(name+ " гуляет");
    }

}
