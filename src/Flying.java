public class Flying extends Birds {
    // класс летающие
    String typeMovement;// тип перемещения

    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        if (typeMovement!=null && !typeMovement.isBlank()&&!typeMovement.isEmpty()) {
            this.typeMovement = typeMovement;
        } else {this.typeMovement = "Не задано";}
    }
    public void flying() {
        System.out.println(name+ " летает");
    }

}
