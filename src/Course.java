import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private Professor prof;
    private TA ta;
    private ArrayList<Student> participants = new ArrayList<>();
    private boolean isFull;


    public Course(int id, String name, int cap, Professor prof){
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
        this.prof = prof;
    }

    public void enroll(Student student){
        this.participants.add(student);

    }

    public void apply(TA ta){
        this.ta = ta;
    }

    public void setMaxCap(int max){
        this.maxCapacity = max;
    }

    public Professor getProf(){
        return this.prof;
    }

    public TA getTA(){
        return this.ta;
    }

    public void setTA(TA ta){
        this.ta = ta;
    }

    public void setName(String name){
        this.name = name;
    }

}
