package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this)
            System.out.print("It is not one of us.\n");
        else
            leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
