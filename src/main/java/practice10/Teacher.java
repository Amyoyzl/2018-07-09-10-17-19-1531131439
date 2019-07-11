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

    public LinkedList<Klass> getKlass() {
        return classes;
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
        for(Klass klass : classes) {
            classesString += klass.getNumber() + " ,";
        }
        return classesString.substring(0, classesString.length() - 3);
    }

}
