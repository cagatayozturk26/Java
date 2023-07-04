public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int verbal;
    int exam;
    double note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbal = 0;
        this.exam = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
        } else
            System.out.println("Akademisyen girişi hatalı !");
    }
    public void ortalama(){
        this.note = this.exam * 0.8 + this.verbal * 0.2;
    }
}
