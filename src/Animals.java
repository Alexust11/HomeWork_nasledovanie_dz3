abstract public class Animals {
    String name;
    int age;
    String livingEnvironment; // среда обитания

    public Animals(String name, int age, String livingEnvironment) {
        if (name!=null && !name.isBlank()&&!name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Имя задано не корректно";
        }
        if (age<0) {
            this.age = Math.abs(age);
        } else { this.age =age;
        }

        if (livingEnvironment!=null && !livingEnvironment.isBlank()&&!livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {this.livingEnvironment = "Имя задано не корректно";
        }
    }


    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name!=null && !name.isBlank()&&!name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Имя задано не корректно";
        }
    }

    public int getAge() {
        return age;
    }



    public String getLivingEnvironment() {
        return livingEnvironment;
    }



    abstract public void eat();

    public void sleep() {
        System.out.println(name+ " спит");
    }

    abstract public void go();

}
