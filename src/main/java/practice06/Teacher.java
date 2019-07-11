package practice06;

public class Teacher extends Person {

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(klass!=0)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",super.getName(),super.getAge(),klass);
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",super.getName(),super.getAge());

    }
}
