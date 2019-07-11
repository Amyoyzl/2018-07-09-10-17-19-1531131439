package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this)
            System.out.print("It is not one of us.\n");
        else {
            leader = student;
            System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
