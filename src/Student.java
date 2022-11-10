import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private Project project;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String name, Course course){
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
}
