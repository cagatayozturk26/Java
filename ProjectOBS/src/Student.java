public class Student {
    String name;
    String stNo;
    int classes;
    Course mat;
    Course kimya;
    Course turkce;
    double average;

    public Student(String name, String stNo, int classes, Course mat, Course kimya, Course turkce) {
        this.name = name;
        this.stNo = stNo;
        this.classes = classes;
        this.mat = mat;
        this.kimya = kimya;
        this.turkce = turkce;
    }

    public void addExamNote(int mat, int kimya, int turkce) {
        if (mat >= 0 && mat <= 100)
            this.mat.exam = mat;
        if (kimya >= 0 && kimya <= 100)
            this.kimya.exam = kimya;
        if (turkce >= 0 && turkce <= 100)
            this.turkce.exam = turkce;
    }


    public void addVerbalNote(int mat, int kimya, int turkce) {
        if (mat >= 0 && mat <= 100)
            this.mat.verbal = mat;
        if (kimya >= 0 && kimya <= 100)
            this.kimya.verbal = kimya;
        if (turkce >= 0 && turkce <= 100)
            this.turkce.verbal = turkce;
    }


    public void isPass() {
        if (this.mat.exam == 0 || this.kimya.exam == 0 || this.turkce.exam == 0 || this.mat.verbal == 0 || this.kimya.verbal == 0 || this.turkce.verbal == 0) {
            System.out.print("Notlar henüz girilmemiştir.");
        } else {
            this.average = (this.mat.note + this.kimya.note + this.turkce.note) / 3;
            System.out.print("Öğrencinin not ortalaması : " + this.average + "\n");
            if (this.average >= 55)
                System.out.print("Sınıfı geçti.");
            else
                System.out.print("Sınıfta kaldı.");
        }
    }

    public void printNote() {

        System.out.println("Matematik Not Ortalaması : " + this.mat.note);
        System.out.println("Kimya Not Ortalaması : " + this.kimya.note);
        System.out.println("Türkçe Not Ortalaması : " + this.turkce.note);

    }

    public void ortalama() {
        this.mat.note = this.mat.exam * 0.8 + this.mat.verbal * 0.2;
        this.kimya.note = this.kimya.exam * 0.8 + this.kimya.verbal * 0.2;
        this.turkce.note = this.turkce.exam * 0.8 + this.turkce.verbal * 0.2;
    }

}

