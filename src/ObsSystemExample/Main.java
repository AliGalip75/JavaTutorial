package ObsSystemExample;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","555");
        Teacher t2 = new Teacher("Ali Hoca","FZK","000");
        Teacher t3 = new Teacher("Emine Hoca","BIO","111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Ali","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(10,1,67,34,78,54);
        //s1.printNote();
        s1.isPass();
        Student s2 = new Student("Mehmet","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(43,67,90,77,90,40);
        s2.isPass();
    }
}