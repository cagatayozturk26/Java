
public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "101", "MAT");
        Course kimya = new Course("Kimya", "101", "KMY");
        Course turkce = new Course("Türkçe", "101", "TRK");

        Teacher t1 = new Teacher("Çağatay ÖZTÜRK", "0505 500 00 00", "MAT");
        Teacher t2 = new Teacher("Süleyman GÜNAY", "0505 500 00 01", "KMY");
        Teacher t3 = new Teacher("Rumeysa ÖZTÜRK", "0505 500 00 02", "TRK");

        mat.addTeacher(t1);
        kimya.addTeacher(t2);
        turkce.addTeacher(t3);

        Student s1 = new Student("Selim Emre GÜNAY", "001", 3, mat, kimya, turkce);
        s1.addExamNote(50, 60, 70);
        s1.addVerbalNote(30, 30, 30);
        System.out.println("Öğrenci adı : " + s1.name);
        s1.ortalama();
        s1.printNote();
        s1.isPass();
    }
}