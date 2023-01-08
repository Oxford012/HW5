import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private Project project;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String name, Course course){         // ein Student braucht mindestens einen Kurs um erstellt zu werden
        this.name = name;
        this.id = id;
        courses.add(course);
    }

    public String getName(){
        return this.name;
    }

    public Project getProject() {
        return this.project;        // Fall 0: Es wird "null" zurückgegeben; Fall 1: es wird das entsprechende Projekt zurückgegeben

    }

    public void addCourse(Course course){
        this.courses.add(course);           // der Student kann unendlich vielen Kursen beitreten
        course.enroll(this);
    }
}
