package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String string = super.introduce() + " I am a Teacher.";
        if (getKlass() != null) {
            string += " I teach " + getKlass().getDisplayName() + ".";
        } else {
            string += " I teach No Class.";
        }
        return string;
    }

    public String introduceWith(Student student) {
        String string = super.introduce() + " I am a Teacher.";
        if (getKlass() != null && student.getKlass().getNumber() == getKlass().getNumber()) {
            string += " I teach " + student.getName() + ".";
        } else {
            string += " I don't teach " + student.getName() + ".";
        }
        return string;
    }
}