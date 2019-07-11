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
            teacher.lookNewMessage(String.format("%s become Leader of Class %d.", student.getName(), this.number));
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        teacher.lookNewMessage(String.format("%s has joined Class %d.", student.getName(), this.number));
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
