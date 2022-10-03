public class Birds extends Animals{

    // класс птицы


    public Birds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);

    }

    @Override
    public void eat() {
        System.out.println(name+ " кушает");
    }

    @Override
    public void go() {
        System.out.println(name+ " перемещается");
    }

    public final void hunting() {
        System.out.println(name+ " охотится");
    }
}
