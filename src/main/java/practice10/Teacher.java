package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (student.getKlass() == klass)
                return true;
        }
        return false;
    }

    @Override
    public String introduce() {
        if (classes == null)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",
                    super.getName(), super.getAge());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %s.",
                    super.getName(), super.getAge(), getClassesNumber());

    }

    private String getClassesNumber() {
        String classesString = "";
        for (Klass klass : classes) {
            classesString += klass.getNumber() + ", ";
        }
        return classesString.substring(0, classesString.length() - 2);
    }

    public String introduceWith(Student student) {
        if (isTeaching(student))
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                    super.getName(), super.getAge(), student.getName());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.",
                    super.getName(), super.getAge(), student.getName());
    }

}
