public class Mammals extends Animals{
    //класс млекопитающие
    int speed;

    @Override
    public void eat() {
        System.out.println(name+ " кушает");
    }

    @Override
    public void go() {
        System.out.println(name+ " перемещается");
    }

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment);
        if (speed<0) {
            this.speed = Math.abs(speed);
        } else {this.speed =speed;
        }
    }

    public void walk() {
        System.out.println(name+ " гуляет");
    }

}
