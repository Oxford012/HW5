import java.util.ArrayList;

public class Project {
    private String name;
    private ArrayList<Student> members = new ArrayList<>();

    public Project(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }
    private void addMember(Student student){
        this.members.add(student);  // Man kann umbeschränkt viele Mitglieder hinzufügen, sollte das Projekt gelöscht werden bleiben die Students erhalten
    }
    public ArrayList getMember(){
        return this.members;
    }
}
