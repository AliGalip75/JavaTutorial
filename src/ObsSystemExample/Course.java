package ObsSystemExample;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralGrade;
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralGrade = 0;
    }
    void printTeacherInfo(){
        //this.teacher.printTeacher();
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        }else{
            System.out.println("Bölümler uyuşmuyor.");
        }
    }
}
