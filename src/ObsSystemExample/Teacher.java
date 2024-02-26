package ObsSystemExample;

public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void printTeacher(){
        System.out.println("Öğretmen adı:" + this.name);
        System.out.println("Öğretmen bölümü:" + this.branch);
        System.out.println("Öğretmen tel:" + this.mpno);
    }
}
