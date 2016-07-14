package singularity.twodolist;
import java.util.ArrayList;

public class Task {
    public String task_name;
    public String task_note;
    public boolean task_completed;
    public ArrayList<Subtask> subtasks;

    Task(String task_name, String task_note, boolean task_completed, ArrayList<Subtask> subtasks){
        this.task_name = task_name;
        this.task_note = task_note;
        this.task_completed = task_completed;
        this.subtasks = subtasks;
    }

    Task() {
        this.task_name = null;
        this.task_note = null;
        this.task_completed = false;
        this.subtasks = null;
    }
}
