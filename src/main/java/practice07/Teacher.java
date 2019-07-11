package practice07;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass != null)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", super.getName(), super.getAge(), klass.getNumber());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge());

    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber() == klass.getNumber())
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                super.getName(),super.getAge(),student.getName());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.",
                    super.getName(),super.getAge(),student.getName());
    }
}
