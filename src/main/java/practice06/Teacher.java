package practice06;

public class Teacher extends Person{
    private int klass = -1;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String string = super.introduce() + " I am a Teacher.";
        if (getKlass() != -1) {
            string += " I teach Class " + getKlass() + ".";
        } else {
            string += " I teach No Class.";
        }
        return string;
    }
}
