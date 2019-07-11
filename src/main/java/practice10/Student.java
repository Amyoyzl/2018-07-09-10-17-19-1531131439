package practice10;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this == klass.getLeader())
            return String.format("My name is %s. I am %d years old. I am a Student. I am Leader of Class %d.", super.getName(), super.getAge(), klass.getNumber());
        else
            return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", super.getName(), super.getAge(), klass.getNumber());
    }
}
