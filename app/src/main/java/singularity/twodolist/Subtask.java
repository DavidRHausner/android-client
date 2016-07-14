package singularity.twodolist;

public class Subtask {
    public String subtask_name;
    public String subtask_note;
    public boolean subtask_completed;

    Subtask(String task_name, String task_note, boolean task_completed){
        this.subtask_name = task_name;
        this.subtask_note = task_note;
        this.subtask_completed = task_completed;
    }

    Subtask() {
        this.subtask_name = null;
        this.subtask_note = null;
        this.subtask_completed = false;
    }
}
