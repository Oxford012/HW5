import java.util.ArrayList;

public class Exam {
    private int maxValue;
    private ArrayList<Student> participants = new ArrayList<>();
    private ArrayList<Question> questions = new ArrayList<>();

    public Exam(int value){
        this.maxValue = maxValue;
        questions.add(new Question(1,"Welcome to the exam", 0)); // um ein Examen zu erstellen muss immer eine Frage eingefügt werden
    }

    public boolean register(Student student){
        this.participants.add(student);
        return true;
    }

    public void addQuestion(int id, String task, int value){
        questions.add(new Question(id, task, value));       // sollte Exam gelöscht werden, existieren die Fragen nicht weiter, da Sie nur in der Arraylist gespeichert sind
    }



}
